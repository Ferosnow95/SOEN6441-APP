package service;
import twitter4j.*;

import javax.inject.Singleton;
import java.util.stream.Stream;

/**
 * @author
 * @date 2020-11-04
 */
@Singleton
public class TwitterService {

    private Twitter twitter = new TwitterFactory().getInstance();
    /**
     *
     * @param keyWords  search term
     * @param tweetsCnt  the max num of tweets to be retrieved
     * @return the tweets content
     * @throws TwitterException exception generated from twitter4j denoting net IO exception
     */
    public Stream<String> searchTweets(String keyWords, int tweetsCnt) throws TwitterException {
        Query query = new Query(keyWords);
        QueryResult result = twitter.search(query);
        /**
         * streams are lazy—the operation on the source data is only performed when the terminal operation is initiated.
         * limit() method can
         */
        return result.getTweets().stream().limit(tweetsCnt)
                .map(item -> item.getText());
    }

}

