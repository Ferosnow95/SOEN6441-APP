package bachEndSOEN6441project;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String keyWords = "Montreal";
		ArrayList<String> tweets = TweetManager.getTweets(keyWords);
	
		for(String tweet : tweets) {
			System.out.println(tweet + " : " + tweet);
		}
	}
}
