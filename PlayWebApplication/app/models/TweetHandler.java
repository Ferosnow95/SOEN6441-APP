package models;

import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TweetHandler {

    public static List<Status> searchByHashTag(String searchKeys) throws TwitterException {

        Twitter twitter = new TwitterFactory().getInstance();
        List<Status> tweetList = new ArrayList<Status>();
        QueryResult result = twitter.search(new Query(searchKeys));
        tweetList = result.getTweets().stream()
                .limit(10)
                .collect(toList());;

        return tweetList;
    }

    public static ArrayList<String> getTweets(String searchKeys) {
        int count=1;
        Twitter twitter = new TwitterFactory().getInstance();
        ArrayList<String> tweetList = new ArrayList<String>();
        try {
            Query query = new Query(searchKeys);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    tweetList.add(tweet.getText());
                    count++;
                }
            } while ( (query = result.nextQuery()) != null && count <= 250 );
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return tweetList;
    }

}
