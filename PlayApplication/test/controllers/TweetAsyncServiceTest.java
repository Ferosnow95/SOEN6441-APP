package controllers;

import twitter4j.*;
import twitter4j.auth.AccessToken;


import org.junit.Before;
import org.junit.Test;
import twitter4j.conf.Configuration;
import twitter4j.conf.PropertyConfiguration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static org.junit.Assert.*;

public class TweetAsyncServiceTest extends StatusAdapter implements ConnectionLifeCycleListener {

    protected Properties p;
    protected Configuration config1,conf2, conf3;


    @Before
    protected void beforeEach() throws Exception {
        this.status = null;
        this.deletionNotice = null;
        p = getNextProperty();

        conf2 = new PropertyConfiguration(p, "/id2");
        conf3 = new PropertyConfiguration(p, "/id3");
        config1 = new PropertyConfiguration(p, "/bestFriend1");
    }

    final List<String> received = new ArrayList<String>();
    final Object lock = new Object();

    @Test
    void testRawStreamListener() throws Exception {
        TwitterStream twitterStream1 = new TwitterStreamFactory(config1).getInstance().addListener(new RawStreamListener() {
            @Override
            public void onMessage(String rawString) {
                received.add(rawString);
                synchronized (lock) {
                    lock.notify();
                }
            }

            @Override
            public void onException(Exception ex) {
            }
        }).sample();
        synchronized (lock) {
            lock.wait();
        }
        assertTrue(received.size() > 0);
        twitterStream1.shutdown();
    }

    @Test
    void testNoListener() throws Exception {
        TwitterStream twitterStream;
        twitterStream = new TwitterStreamFactory().getInstance();
        twitterStream.setOAuthConsumer("dummy", "dummy");
        twitterStream.setOAuthAccessToken(new AccessToken("dummy", "dummy"));
        try {
            twitterStream.sample();
            fail("expecting IllegalStateException");
        } catch (IllegalStateException ignored) {
        }
        try {
            twitterStream.filter(new FilterQuery().track(new String[]{"twitter"}));
            fail("expecting IllegalStateException");
        } catch (IllegalStateException ignored) {
        }
        try {
            twitterStream.firehose(0);
            fail("expecting IllegalStateException");
        } catch (IllegalStateException ignored) {
        }
        try {
            twitterStream.retweet();
            fail("expecting IllegalStateException");
        } catch (IllegalStateException ignored) {
        }

        twitterStream.addListener(new RawStreamListener() {
            @Override
            public void onMessage(String rawString) {
            }

            @Override
            public void onException(Exception ex) {
            }
        }).sample().cleanUp().shutdown();
    }

    @Test
    void testSample() throws Exception {
        TwitterStream twitterStream2 = new TwitterStreamFactory(conf3).getInstance();
        twitterStream2.addListener(this);
        twitterStream2.sample();
        waitForStatus();
        assertTrue(status != null || deletionNotice != null);
        final List<Status> statuses = new ArrayList<Status>();
        StatusListener listener = new StatusAdapter() {
            @Override
            public synchronized void onStatus(Status status) {
                statuses.add(status);
                this.notifyAll();
            }
        };
        twitterStream2.replaceListener(this, listener);
        waitForStatus();
        status = null;
        waitForStatus();
        assertTrue(statuses.size() > 0);
        twitterStream2.shutdown();
    }

    @Test
    void testFilterTrackPush() throws Exception {
        TwitterStream twitterStream1 = new TwitterStreamFactory(conf2).getInstance()
                .addListener(this)
                .addConnectionLifeCycleListener(this);
        assertFalse(onConnectCalled);
        assertFalse(onDisconnectCalled);
        assertFalse(onCleanUpCalled);

        twitterStream1.filter(new FilterQuery(0, null, new String[]{"twitter", "iphone"}));
        waitForStatus();
        assertTrue(onConnectCalled);
        assertFalse(onDisconnectCalled);
        assertFalse(onCleanUpCalled);

        assertNotNull(status.getText());
        assertTrue("web".equals(status.getSource()) || status.getSource().contains("<a href=\""));
        this.ex = null;
        twitterStream1.filter(new FilterQuery(0, null).track(new String[]{"twitter4j java", "ipad"}));
        waitForStatus();
        assertNull(ex);

        twitterStream1.cleanUp();
        Thread.sleep(1000);

        assertTrue(onConnectCalled);
        assertTrue(onDisconnectCalled);
        assertTrue(onCleanUpCalled);
        twitterStream1.shutdown();
    }

    @Test
    void testFilterIncludesEntities() throws Exception {
        this.ex = null;
        FilterQuery query = new FilterQuery(0, null, new String[]{"http", "#", "@"});
        TwitterStream twitterStream2 = new TwitterStreamFactory(conf2).getInstance();
        twitterStream2.addListener(this);
        twitterStream2.filter(query);

        boolean sawURL, sawMention, sawHashtag;
        do {
            waitForStatus();
            sawURL = status.getURLEntities().length > 0;
            sawMention = status.getUserMentionEntities().length > 0;
            sawHashtag = status.getHashtagEntities().length > 0;
        } while (!sawURL || !sawMention || !sawHashtag);

        assertNull(ex);

        twitterStream2.cleanUp();
        twitterStream2.shutdown();
    }

    boolean onConnectCalled = false;
    boolean onDisconnectCalled = false;
    boolean onCleanUpCalled = false;

    public void onConnect() {
        onConnectCalled = true;
    }

    public void onDisconnect() {
        onDisconnectCalled = true;
    }

    public void onCleanUp() {
        onCleanUpCalled = true;
    }

    private synchronized void notifyResponse() {
        this.notify();
    }

    private synchronized void waitForStatus() {
        try {
            this.wait(2000);
            System.out.println("notified.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void waitForNotification() {
        try {
            this.wait(2000);
            System.out.println("notified.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    Status status;

    public void onStatus(Status status) {
        this.status = status;
        String json = TwitterObjectFactory.getRawJSON(status);
        try {
            assertNotNull(json);
            Status statusFromJSON = TwitterObjectFactory.createStatus(json);
            assertEquals(status, statusFromJSON);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
//        System.out.println("got status from stream:" + status.toString());
        assertNotNull(status.getText());
//        System.out.println(status.getCreatedAt() + ":" + status.getText() + " from:" + status.getSource());
        notifyResponse();
    }

    StatusDeletionNotice deletionNotice;

    //onDeletionNoice
    public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
        this.deletionNotice = statusDeletionNotice;
        System.out.println("got status deletionNotice notification:" + statusDeletionNotice.toString());
        notifyResponse();
    }

    int trackLimit;

    //onTrackLimitNotice
    public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
        this.trackLimit = numberOfLimitedStatuses;
        System.out.println("got limit notice:" + numberOfLimitedStatuses);
        notifyResponse();
    }

    Exception ex;

    public void onException(Exception ex) {
        this.ex = ex;
        ex.printStackTrace();
        notifyResponse();
    }

    private static int currentIndex;
    private static int maxTestPropertyIndex = -1;

    static {
        // set properties in test.properties to System property
        InputStream resource;
        try {
            resource = new FileInputStream("test.properties");
        } catch (FileNotFoundException fnfe) {
            try {
                resource = new FileInputStream("../test.properties");
            }catch (FileNotFoundException fnfe2) {
                resource = TweetAsyncServiceTest.class.getResourceAsStream("/test.properties");
            }
        }

        if (resource != null) {
            Properties properties = new Properties();
            try {
                properties.load(resource);
                resource.close();
            } catch (IOException ignore) {
            }
            for (String propertyName : properties.stringPropertyNames()) {
                System.setProperty(propertyName, properties.getProperty(propertyName));
            }
        }
        // look up the number of property sets
        for (int i = 0; i < 100; i++) {
            String propName = i + ".id1.id";
            String envName = "t4j" + propName.replaceAll("\\.", "_");
            if (System.getProperty(propName, System.getenv(envName)) != null) {
                maxTestPropertyIndex = i;
            } else {
                break;
            }
        }
        currentIndex = (int) (System.currentTimeMillis() % (maxTestPropertyIndex + 1));
    }

    /**
     * rotate test property file
     *
     * @return test[index].properties as InputStream
     */
    private static Properties getNextProperty() {
        currentIndex++;
        if (currentIndex > maxTestPropertyIndex) {
            currentIndex = 0;
        }
        Properties props = new Properties();

        String prefix = String.valueOf(currentIndex) + ".";
        String envPrefix = "t4j" + String.valueOf(currentIndex) + "_";
        Map<String, String> map = System.getenv();
        for (String key : map.keySet()) {
            if (key.startsWith(envPrefix)) {
                props.setProperty(key.substring(envPrefix.length()).replaceAll("_", "."), map.get(key));
            }
        }
        for (String key : System.getProperties().stringPropertyNames()) {
            if (key.startsWith(prefix)) {
                props.setProperty(key.substring(prefix.length()), System.getProperty(key));
            }
        }
        return props;
    }
}