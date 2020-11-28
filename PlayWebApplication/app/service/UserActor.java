package service;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import models.Tweet;
import twitter4j.TwitterException;

import java.util.ArrayList;

/**
 * User Actor to handle search request
 *
 */
public class UserActor extends AbstractActor {

    public static Props props(ActorRef out) {
        return Props.create(UserActor.class, out);
    }

    private final ActorRef out;
    private TweetService tweetService = new TweetService();

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
        context().actorSelection("/user/SearchActor/")
                .tell(new SearchActor.RegisterMessage(), self());
    }

    @Override
    public Receive createReceive() {

        return receiveBuilder()
                .match(String.class, this::sendSearchResult)
                .build();
    }

    /**
     * Method to send initial search results
     *
     * @param search
     */
    private void sendSearchResult(String search) {
        ArrayList<Tweet> tweetList= tweetService.getTweets(search);
        out.tell(tweetList.toString(), self());
    }
}
