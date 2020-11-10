package service;
import java.util.ArrayList;
import java.util.List;


import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;




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
}
