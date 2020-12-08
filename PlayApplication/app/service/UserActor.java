package service;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.Props;
import com.fasterxml.jackson.databind.JsonNode;
import models.Tweet;
import models.TweetQuery;
import twitter4j.TwitterException;
import utils.MessageConverter;

import java.util.ArrayList;

/**
 * User Actor to handle search request
 *
 */
public class UserActor extends AbstractActor {

    public static Props props(ActorRef out) {
        return Props.create(UserActor.class, out);
    }
    private ActorSelection searchActor;
    private final ActorRef out;

    /**
     * Constructor to initialize ActorRef
     *
     * @param out
     * @throws TwitterException
     */
    public UserActor(ActorRef out) throws TwitterException {
        this.out = out;
    }

    @Override
    public void preStart() {
        searchActor = context().actorSelection("/user/SearchActor/");
        searchActor.tell(new SearchActor.RegisterMessage(), self());
        context().actorSelection("/user/ProfileActor/")
                .tell(new SearchActor.RegisterMessage(), self());
    }

    @Override
    public Receive createReceive() {

        return receiveBuilder()
                .match(String.class, this::sendSearchResult)
                .match(JsonNode.class, this::sendSearchAsync)
                .match(Tweet.class, this::sendResult)
                .build();
    }

    private void sendResult(Tweet tweet) {
        out.tell(MessageConverter.tweetToJsonNode(tweet), self());
    }

    private void sendSearchAsync(JsonNode request) {
        TweetQuery query = MessageConverter.jsonNodeToTweetQuery(request);
        TweetService.getTweetsAsync(query.getSearchKey(), self());
        searchActor.tell(query, self());
    }

    /**
     * Method to send initial search results
     *
     * @param search
     */
    private void sendSearchResult(String search) {
        ArrayList<Tweet> tweetList = TweetService.getTweets(search);
        out.tell(tweetList.toString(), self());
    }
}
