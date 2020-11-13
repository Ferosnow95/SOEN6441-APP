package service;

import models.Profile;
import models.Tweet;
import models.TwitterResultModel;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DateFormatter;

import static java.util.stream.Collectors.toList;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;

public class TweetService {

    /**
     * Service Class
     * @param //searchKeys
     * @return
     * @author Ali Zafar Iqbal X Negin
     */

    public TweetService() throws TwitterException {
    }

    /**
     * Tweet API Instance Class
     * @param //searchKeys
     * @return  //searchKeys
     * @author Ali Zafar Iqbal
     */


    public static ArrayList<Tweet> getTweets(String searchKeys) {
        Twitter twitter = new TwitterFactory().getInstance();
        return getTweetsUtil(searchKeys, twitter);
    }


    /**
     * Getter tweets Search
     * @param //searchKeys
     * @return  //searchKeys
     * @author Ali Zafar Iqbal X Negin
     */

    public static ArrayList<Tweet> getTweetsUtil(String searchKeys, Twitter twitter) {
        int count = 0;
        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
        try {
            Query query = new Query(searchKeys);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
                for (Status tweet : tweets) {
                    tweetList.add(new Tweet(tweet.getUser().getScreenName(), tweet.getText(), date.format(tweet.getCreatedAt())));
                    count++;
                    if(count==10) {
                        break;
                    }
                }
            } while ( (query = result.nextQuery()) != null && count <= 2 );
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return tweetList;
    }

    /**
     * Profile API Instance Class
     * @param //handle
     * @return //handle,twitter
     * @author Ali Zafar Iqbal
     */

    public static Profile getProfile(String handle) {
        Twitter twitter = new TwitterFactory().getInstance();
        return getProfileUtil(handle, twitter);
    }

    /**
     * Getter Profile data
     * @param //searchKeys
     * @return  //searchKeys
     * @author Ali Zafar Iqbal
     */

    public static Profile getProfileUtil(String handle, Twitter twitter) {
    
        String name       = ""; 
        String screenName = ""; 
        String description= "";
        int followers     = 0; 
        int following     = 0;
        String link       = "";
        String dateJoined = "";
        ArrayList<Tweet> tweets   =  new ArrayList<Tweet>();
        String imageLink  = "";


        try {
            SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd hh.mm aa");
            User user = twitter.showUser(handle);
           System.out.print("***************************************"+user.getName());
            name        = user.getName();
            screenName  = user.getScreenName();
            description = user.getDescription();
            followers   = user.getFollowersCount();
            following   = user.getFriendsCount(); 
            link        = user.getURL(); 
            dateJoined  = date.format(user.getCreatedAt());
            imageLink   = user.get400x400ProfileImageURL();

            List<Status> timeline = twitter.getUserTimeline(handle);
            int count = 0;
            if (timeline != null)
            for (Status tweet : timeline) {
                tweets.add(new Tweet(tweet.getUser().getScreenName(), tweet.getText(), date.format(tweet.getCreatedAt())));
                count++;
                if(count==10) {
                    break;
                }
            }
        
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get profile: " + te.getMessage());
            System.out.println("userId: "+handle);
        }
        return new Profile(name, screenName, description, followers, following, link, dateJoined, tweets, imageLink);
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
