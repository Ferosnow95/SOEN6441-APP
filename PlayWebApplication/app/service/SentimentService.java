package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 * Sentiment is the feeling a person gain after reading a writing
 * in our case we want to find out what is the sentiment of a group (250)
 * of tweets which each search gives us
 * <p>
 *
 * @param  tweets the input search term
 * @return java stream
 * @author Ahmad Memari
 * @since  1.0
 * @date 2020-11-06
 */

public class SentimentService {

    static List<String> tweetsStrem = new ArrayList<String>();
    static List<String> sadWords = new ArrayList<String>();
    static List<String> happyWords = new ArrayList<String>();







//    public Future<String> AsyncProcessTweet() {
//    	CompletableFuture<String> futureSentiment = new CompletableFuture<>();
//    	new Thread( () -> {
//    		try {
//    	    	String result = ProcessTweet();
//    	    	futureSentiment.complete(result);
//    	    	} catch (Exception ex) {
//    	    	futureSentiment.completeExceptionally(ex);
//    	    	}
//    	}).start();
//    	return futureSentiment;
//    	}

    public Future<String> AsyncProcessTweet() {
        return CompletableFuture.supplyAsync(() -> ProcessTweet());
    }





    /**
     * Reads and sets happy and sad list of words from text files.
     *
     * @param tweets as an input
     * @return result: happy, sad or neutral
     * @see         String
     * @since  1.0
     */

    public void GetWrods() throws Exception {
//        try {
        BufferedReader sadReader = new BufferedReader(new FileReader(new File(
                "app\\utility\\sad-words.txt")));
        BufferedReader happyReader = new BufferedReader(new FileReader(new File(
                "app\\utility\\happy-words.txt")));
        /**
         * currently reads word
         */

        String word;

        /**
         * adds words to comparison list
         */

        while ((word = sadReader.readLine()) != null) {
            sadWords.add(word);
        }
        while ((word = happyReader.readLine()) != null) {
            happyWords.add(word);
        }

        /**
         * cleanup
         */

        sadReader.close();
        happyReader.close();
    }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//
//        }

//}

    /**
     * Class constructor which gets list of tweets
     * and run the method which sets happy and sad list of words.
     *
     * @param tweets as an input
     * @return result: happy, sad or neutral
     * @see         String
     * @since  1.0
     */
    public SentimentService(List<String> tweets) throws Exception{
        tweetsStrem = tweets;
        GetWrods();
    }



    public SentimentService(CompletionStage<ArrayList<String>> futureTweetList) throws Exception{
        tweetsStrem = (List<String>) futureTweetList;
        GetWrods();
    }





    /**
     * Computes the overall sentiment of each group of tweets.
     * @return result: happy, sad or neutral
     * @see         String
     */
    public String ProcessTweet(){

        String result = "neutral";
        ArrayList<String> happyOrSadList = new ArrayList<>();
        for (String tweet:tweetsStrem)
        {
            ArrayList<String> tweetWords = (ArrayList<String>) Arrays.stream((tweet.split(" "))).collect(Collectors.toList());
            long sadCount = tweetWords.stream()
                    .filter(t -> sadWords.contains(t))
                    .count();
            long happyCount = tweetWords.stream()
                    .filter(t -> happyWords.contains(t))
                    .count();

            String happyOrSad = "n";
            if (sadCount < happyCount )
                happyOrSad = "h";
            if (sadCount > happyCount)
                happyOrSad = "s";
            if(happyCount == sadCount)
                happyOrSad = "n";

            happyOrSadList.add(happyOrSad);
        }
        long sadTweetsCount = happyOrSadList.stream().filter(x -> x.equals("s")).count();
        long happyTweetsCount = happyOrSadList.stream().filter(x -> x.equals("h")).count();
        if(happyTweetsCount >= tweetsStrem.stream().count()*55/100 )
            result = "happy";
        if(sadTweetsCount >= tweetsStrem.stream().count()*55/100 )
            result = "sad";
//        if (happyTweetsCount == sadTweetsCount)
//            result = "nuetral";

        return result;

    }
}

