package service;

import models.TwitterResultModel;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TweetService {

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
            } while ( (query = result.nextQuery()) != null && count <= 10 );
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return tweetList;
    }

    public static List<String> searchByHashTag(String hashTag) throws TwitterException {

        Twitter twitter = new TwitterFactory().getInstance();
        QueryResult result = twitter.search(new Query(hashTag));

        List<String> tweetList = result.getTweets().stream()
                .limit(10)
                .sorted()
                .map(s ->{
                    return new TwitterResultModel().toString(); })
                .collect(toList());;

        return tweetList;
    }

}
