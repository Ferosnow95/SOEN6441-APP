package controllers;

import models.Profile;
import models.Tweet;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import service.TweetService;
import twitter4j.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static org.mockito.Mockito.*;


//
/**
 * Mock Test for Twitter Service
 * @author Ali Zafar Iqbal
 * @date 2020-11-13
 */
@RunWith(MockitoJUnitRunner.class)
public class TweetServiceTest {





@Mock
TweetService tweetService;

public  ArrayList<Tweet> expectedTweets = new ArrayList<Tweet>(
        Arrays.asList(
                new Tweet("@test1", "This is my content of test 1", "2020-11-13 10:30"),
                new Tweet("@test2", "This is my content of test 2", "2020-11-14 10:30"),
                new Tweet("@test3", "This is my content of test 3", "2020-11-15 10:30"))
);
public  ArrayList<Tweet> notExpectedTweets = new ArrayList<Tweet>(
        Arrays.asList(
                new Tweet("@test4", "This is my content of test 4", "2020-11-17 10:30"),
                new Tweet("@test5", "This is my content of test 5", "2020-11-18 10:30"),
                new Tweet("@test6", "This is my content of test 6", "2020-11-19 10:30"))
);
public  ArrayList<Tweet> test1Tweet = new ArrayList<Tweet>(
        Arrays.asList(
                new Tweet("@test1", "This is my content of test 1", "2020-11-13 10:30 AM"),
                new Tweet("@test1", "This is content about testing", "2020-11-14 10:30 AM"),
                new Tweet("@test1", "This is content about writing tests", "2020-11-15 10:30 AM"))
);

public Profile expectedProfile = new Profile("Test One","@test1",
        "This test 1 profile is about test",
        100,
        100 ,
        "myTest1.com",
        "2020-11-13 10:30",
        test1Tweet,
        "myImageLink.png"
        );

public Profile notExpectedProfile = new Profile("Test Two","@test2",
        "This test 2 profile is about test",
        150,
        150 ,
        "myTest2.com",
        "2020-11-14 10:30",
        test1Tweet,
        "myImageLink.png"
);

    /**
     * Mock Test for Get Tweets
     * @author Ali Zafar Iqbal
     * @date 2020-11-13
     */

@Test
public void getTweets() throws Exception {
    Twitter twitter = mock(Twitter.class);
    QueryResult result = mock(QueryResult.class);
    List<Status> list = new ArrayList<>();
    list.add(new FakeStatus("test", mock(User.class),  new SimpleDateFormat("yyyy-mm-dd").parse("2020-11-17 10:30")));
    when(twitter.search(new Query("test"))).thenReturn(result);
    when(result.getTweets()).thenReturn(list);
    ArrayList<Tweet> tweets = TweetService.getTweetsUtil("test", twitter);
    assertEquals(1, tweets.size());
//    assertEquals("test", tweets.get(0).screenName);
}
//

    /**
     * Mock Test for Get Profile Data
     * @author Ali Zafar Iqbal
     * @date 2020-11-13
     */
@Test
public void getProfile() throws Exception {
    Twitter twitter = mock(Twitter.class);
    //List<Status> list = new ArrayList<>();
    when(twitter.showUser("@test1")).thenReturn((new FakeUser()));
    when(twitter.getUserTimeline("@test1")).thenReturn(null);
    Profile testProfile = TweetService.getProfileUtil("@test1",twitter);
    assertEquals("@Kun", testProfile.screenName);
}


    /**
     * Database Class for List
     * @author Ali Zafar Iqbal
     * @date 2020-11-13
     */


class FakeList implements ResponseList<Status> {

    @Override
    public RateLimitStatus getRateLimitStatus() {
        return null;
    }

    @Override
    public int getAccessLevel() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Status> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Status status) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Status> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Status> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Status get(int index) {
        return null;
    }

    @Override
    public Status set(int index, Status element) {
        return null;
    }

    @Override
    public void add(int index, Status element) {

    }

    @Override
    public Status remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Status> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Status> listIterator(int index) {
        return null;
    }

    @Override
    public List<Status> subList(int fromIndex, int toIndex) {
        return null;
    }
}


    /**
     * Database Class for User Data
     * @author Ali Zafar Iqbal
     * @date 2020-11-13
     */

class FakeUser implements User{


    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getName() {
        return "Isigami";
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getScreenName() {
        return "@Kun";
    }

    @Override
    public String getLocation() {
        return null;
    }

    @Override
    public String getDescription() {
        return "He is a Treasurer";
    }

    @Override
    public boolean isContributorsEnabled() {
        return false;
    }

    @Override
    public String getProfileImageURL() {
        return null;
    }

    @Override
    public String getBiggerProfileImageURL() {
        return null;
    }

    @Override
    public String getMiniProfileImageURL() {
        return null;
    }

    @Override
    public String getOriginalProfileImageURL() {
        return null;
    }

    @Override
    public String get400x400ProfileImageURL() {
        return "myImageLink.png";
    }

    @Override
    public String getProfileImageURLHttps() {
        return null;
    }

    @Override
    public String getBiggerProfileImageURLHttps() {
        return null;
    }

    @Override
    public String getMiniProfileImageURLHttps() {
        return null;
    }

    @Override
    public String getOriginalProfileImageURLHttps() {
        return null;
    }

    @Override
    public String get400x400ProfileImageURLHttps() {
        return null;
    }

    @Override
    public boolean isDefaultProfileImage() {
        return false;
    }

    @Override
    public String getURL() {
        return "www.chikaisawesome.com";
    }

    @Override
    public boolean isProtected() {
        return false;
    }

    @Override
    public int getFollowersCount() {
        return 0;
    }

    @Override
    public Status getStatus() {
        return null;
    }

    @Override
    public String getProfileBackgroundColor() {
        return null;
    }

    @Override
    public String getProfileTextColor() {
        return null;
    }

    @Override
    public String getProfileLinkColor() {
        return null;
    }

    @Override
    public String getProfileSidebarFillColor() {
        return null;
    }

    @Override
    public String getProfileSidebarBorderColor() {
        return null;
    }

    @Override
    public boolean isProfileUseBackgroundImage() {
        return false;
    }

    @Override
    public boolean isDefaultProfile() {
        return false;
    }

    @Override
    public boolean isShowAllInlineMedia() {
        return false;
    }

    @Override
    public int getFriendsCount() {
        return 1;
    }

    @Override
    public Date getCreatedAt() {
        Date date = new Date();
        try {
            date =  new SimpleDateFormat("yyyy-mm-dd hh.mm aa").parse("2020-11-17 10:30 AM");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public int getFavouritesCount() {
        return 0;
    }

    @Override
    public int getUtcOffset() {
        return 0;
    }

    @Override
    public String getTimeZone() {
        return null;
    }

    @Override
    public String getProfileBackgroundImageURL() {
        return null;
    }

    @Override
    public String getProfileBackgroundImageUrlHttps() {
        return null;
    }

    @Override
    public String getProfileBannerURL() {
        return null;
    }

    @Override
    public String getProfileBannerRetinaURL() {
        return null;
    }

    @Override
    public String getProfileBannerIPadURL() {
        return null;
    }

    @Override
    public String getProfileBannerIPadRetinaURL() {
        return null;
    }

    @Override
    public String getProfileBannerMobileURL() {
        return null;
    }

    @Override
    public String getProfileBannerMobileRetinaURL() {
        return null;
    }

    @Override
    public String getProfileBanner300x100URL() {
        return null;
    }

    @Override
    public String getProfileBanner600x200URL() {
        return null;
    }

    @Override
    public String getProfileBanner1500x500URL() {
        return null;
    }

    @Override
    public boolean isProfileBackgroundTiled() {
        return false;
    }

    @Override
    public String getLang() {
        return null;
    }

    @Override
    public int getStatusesCount() {
        return 0;
    }

    @Override
    public boolean isGeoEnabled() {
        return false;
    }

    @Override
    public boolean isVerified() {
        return false;
    }

    @Override
    public boolean isTranslator() {
        return false;
    }

    @Override
    public int getListedCount() {
        return 0;
    }

    @Override
    public boolean isFollowRequestSent() {
        return false;
    }

    @Override
    public URLEntity[] getDescriptionURLEntities() {
        return new URLEntity[0];
    }

    @Override
    public URLEntity getURLEntity() {
        return null;
    }

    @Override
    public String[] getWithheldInCountries() {
        return new String[0];
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    @Override
    public RateLimitStatus getRateLimitStatus() {
        return null;
    }

    @Override
    public int getAccessLevel() {
        return 0;
    }
}


    /**
     * Database Class for User Status
     * @author Ali Zafar Iqbal
     * @date 2020-11-13
     */

class FakeStatus implements Status {
    private String text;
    private Date date;
    private User user;

    FakeStatus (String text, User user, Date date) {
        this.text = text;
        this.user = user;
        this.date = date;

    }

    @Override
    public Date getCreatedAt() {
        return this.date;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public int getDisplayTextRangeStart() {
        return 0;
    }

    @Override
    public int getDisplayTextRangeEnd() {
        return 0;
    }

    @Override
    public String getSource() {
        return null;
    }

    @Override
    public boolean isTruncated() {
        return false;
    }

    @Override
    public long getInReplyToStatusId() {
        return 0;
    }

    @Override
    public long getInReplyToUserId() {
        return 0;
    }

    @Override
    public String getInReplyToScreenName() {
        return null;
    }

    @Override
    public GeoLocation getGeoLocation() {
        return null;
    }

    @Override
    public Place getPlace() {
        return null;
    }

    @Override
    public boolean isFavorited() {
        return false;
    }

    @Override
    public boolean isRetweeted() {
        return false;
    }

    @Override
    public int getFavoriteCount() {
        return 0;
    }

    @Override
    public User getUser() {
        return this.user;
    }

    @Override
    public boolean isRetweet() {
        return false;
    }

    @Override
    public Status getRetweetedStatus() {
        return null;
    }

    @Override
    public long[] getContributors() {
        return new long[0];
    }

    @Override
    public int getRetweetCount() {
        return 0;
    }

    @Override
    public boolean isRetweetedByMe() {
        return false;
    }

    @Override
    public long getCurrentUserRetweetId() {
        return 0;
    }

    @Override
    public boolean isPossiblySensitive() {
        return false;
    }

    @Override
    public String getLang() {
        return null;
    }

    @Override
    public Scopes getScopes() {
        return null;
    }

    @Override
    public String[] getWithheldInCountries() {
        return new String[0];
    }

    @Override
    public long getQuotedStatusId() {
        return 0;
    }

    @Override
    public Status getQuotedStatus() {
        return null;
    }

    @Override
    public URLEntity getQuotedStatusPermalink() {
        return null;
    }

    @Override
    public int compareTo(Status o) {
        return 0;
    }

    @Override
    public UserMentionEntity[] getUserMentionEntities() {
        return new UserMentionEntity[0];
    }

    @Override
    public URLEntity[] getURLEntities() {
        return new URLEntity[0];
    }

    @Override
    public HashtagEntity[] getHashtagEntities() {
        return new HashtagEntity[0];
    }

    @Override
    public MediaEntity[] getMediaEntities() {
        return new MediaEntity[0];
    }

    @Override
    public SymbolEntity[] getSymbolEntities() {
        return new SymbolEntity[0];
    }

    @Override
    public RateLimitStatus getRateLimitStatus() {
        return null;
    }

    @Override
    public int getAccessLevel() {
        return 0;
    }
}
}
