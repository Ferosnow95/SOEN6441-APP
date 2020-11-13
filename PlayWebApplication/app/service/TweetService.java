package service;

import models.Profile;
import models.Tweet;
import models.TwitterResultModel;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DateFormatter;

import static java.util.stream.Collectors.toList;
import static models.Tweet.reform;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class TweetService {

    public TweetService() throws TwitterException {
    }

    /**
     * @param keyWord
     * @return
     * @author Negin
     */
    public static List<Tweet> getTweets(String keyWord) {


        Twitter twitter = new TwitterFactory().getInstance();
        List<Tweet> result = new ArrayList<Tweet>();
        try {
            Query query = new Query(keyWord);
            result = twitter.search(query).getTweets().stream().limit(10)
                    .map(s -> reform(s)).collect(Collectors.toList());
        } catch (TwitterException error) {
            System.out.println(error.getMessage());
        }
        return result;
    }


    /**
     * @param keyWords
     * @return
     * @author Negin
     */
    public static CompletableFuture<List<Tweet>> getTweetsAsync(String keyWords) {
        return CompletableFuture.supplyAsync(() -> getTweets(keyWords));
    }
//    public static ArrayList<Tweet> getTweets(String searchKeys) {
//
//        int count=0;
//        Twitter twitter = new TwitterFactory().getInstance();
//        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
//        try {
//            Query query = new Query(searchKeys);
//            QueryResult result;
//            do {
//                result = twitter.search(query);
//                List<Status> tweets = result.getTweets();
//                SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
//                for (Status tweet : tweets) {
//                    tweetList.add(new Tweet(tweet.getUser().getId(), tweet.getUser().getScreenName(), tweet.getText(), date.format(tweet.getCreatedAt())));
//                    count++;
//                    if(count==10) {
//                        break;
//                    }
//                }
//            } while ( (query = result.nextQuery()) != null && count <= 2 );
//        } catch (TwitterException te) {
//            te.printStackTrace();
//            System.out.println("Failed to search tweets: " + te.getMessage());
//        }
//        return tweetList;
//    }

    public static Profile getProfile(String handle) {

        String name = "";
        String screenName = "";
        String description = "";
        int followers = 0;
        int following = 0;
        String link = "";
        String dateJoined = "";
        ArrayList<Tweet> tweets = new ArrayList<Tweet>();
        String imageLink = "";

        Twitter twitter = new TwitterFactory().getInstance();
        try {
            SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd hh.mm aa");
            User user = twitter.showUser(handle);
            System.out.print("***************************************" + user.getName());
            name = user.getName();
            screenName = user.getScreenName();
            description = user.getDescription();
            followers = user.getFollowersCount();
            following = user.getFriendsCount();
            link = user.getURL();
            dateJoined = date.format(user.getCreatedAt());
            imageLink = user.get400x400ProfileImageURL();

            List<Status> timeline = twitter.getUserTimeline(handle);
            int count = 0;
            for (Status tweet : timeline) {
                tweets.add(new Tweet(tweet.getUser().getId(), tweet.getUser().getScreenName(), tweet.getText(), date.format(tweet.getCreatedAt())));
                count++;
                if (count == 10) {
                    break;
                }
            }

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get profile: " + te.getMessage());
            System.out.println("userId: " + handle);
        }
        return new Profile(name, screenName, description, followers, following, link, dateJoined, tweets, imageLink);
    }


    public static List<String> searchByHashTag(String hashTag) throws TwitterException {

        Twitter twitter = new TwitterFactory().getInstance();
        QueryResult result = twitter.search(new Query(hashTag));

        List<String> tweetList = result.getTweets().stream()
                .limit(10)
                .sorted()
                .map(s -> {
                    return new TwitterResultModel().toString();
                })
                .collect(toList());
        ;

        return tweetList;
    }
}


