package service;

import models.Tweet;
import models.TwitterResultModel;
import twitter4j.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static java.util.stream.Collectors.toList;

public class HashtagService {

    public CompletableFuture<List<Tweet>> getHashtagAsync(String keyWords) {

        return CompletableFuture.supplyAsync(() -> {
            try {
                return this.searchByHashTag(keyWords);

            } catch (TwitterException e) {
                e.printStackTrace();
            }
            return null;
        });
    }

    public  List<Tweet> searchByHashTag(String hashTag) throws TwitterException {

        Twitter twitter = new TwitterFactory().getInstance();
        QueryResult result = twitter.search(new Query("#"+hashTag));


        List<Tweet> tweetList = result.getTweets().stream()
                .limit(10)
                .sorted()
                .map(h -> new Tweet(h.getUser().getName(), h.getText(),
                        Arrays.stream(h.getHashtagEntities()).map(HashtagEntity::getText).collect(toList())))
                .collect(toList());

        return tweetList;
    }






}

