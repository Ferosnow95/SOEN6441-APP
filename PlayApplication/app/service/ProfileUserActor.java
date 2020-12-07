package service;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import models.Profile;
import models.Tweet;
import twitter4j.TwitterException;

import java.util.ArrayList;

public class ProfileUserActor extends AbstractActor {
    public static Props props( ActorRef out) {
        return Props.create(ProfileActor.class, out);
    }

    private final ActorRef out;
    private TweetService tweetService = new TweetService();

    /**
     * Constructor to initialize ActorRef
     *
     * @param out
     * @throws TwitterException
     */
    public ProfileUserActor(ActorRef out) throws TwitterException {
        this.out = out;
    }

    @Override
    public void preStart() {

        context().actorSelection("/user/ProfileActor/")
                .tell(new ProfileActor.RegisterMessage(), self());
    }


    @Override
    public AbstractActor.Receive createReceive() {

        return receiveBuilder()
                .match(String.class, this::sendProfileSearchResult)
                .build();
    }

    /**
     * Method to send initial search results
     *
     * @param search
     */
    private void sendProfileSearchResult(String search) {
        Profile profile= tweetService.getProfile(search);
        out.tell(profile.toString(), self());
    }
}
