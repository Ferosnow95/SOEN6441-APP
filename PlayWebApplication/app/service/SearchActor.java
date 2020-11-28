package service;

import akka.actor.*;
import akka.actor.ActorRef;
import akka.actor.Props;

import twitter4j.TwitterException;

import java.util.*;

public class SearchActor extends AbstractActor {

    private TweetService tweetService = new TweetService();
    private List<ActorRef> userActors = new LinkedList<>();


    /**
     * Class used to register UserActor
     *
     */
    static public class RegisterMessage {

    }


    /**
     * Class used to Push Clients
     *
     */
    static public class PushClients {

    }

    /**
     *
     *
     * @param out
     * @return
     */
    // creating an instance of actor
    public static Props props(ActorRef out) {
        return Props.create(SearchActor.class, out);
    }

    private final ActorRef out;

    public SearchActor(ActorRef out) throws TwitterException {
        this.out = out;
    }

//    @Override
//    public Receive createReceive() {
//        return receiveBuilder()
//                .match(String.class, message -> out.tell(tweetService.getTweets(message).toString(), self()))
//                .build();
//    }

//    @Override
//    public Receive createReceive() {
//        return receiveBuilder()
//                .match(String.class, message -> out.tell("I received your message: " + message, self()))
//                .build();
//    }


    @Override
    public void preStart() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                new PushClients();
            }
        }, 0, 1000);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(RegisterMessage.class, message -> userActors.add(sender()))
                .match(PushClients.class, message -> sendPush())
                .build();

    }

    /**
     * Method to push tweeter updates realtime
     *
     */
    //TODO: need to identify a way to stream in real time
    void sendPush() {
        userActors.forEach(ar -> ar.tell("hi", self()));
    }





}