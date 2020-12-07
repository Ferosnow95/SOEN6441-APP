package service;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import twitter4j.TwitterException;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ProfileActor extends AbstractActor {


    public static Props props(ActorRef out) {
        return Props.create(ProfileActor.class, out);
    }

    private final ActorRef out;
    private List<ActorRef> userActors = new ArrayList<>();

    /**
     * Class used to register UserActor
     *
     */
    static public class RegisterMessage {

    }


    /**
     * Class used to Push messages to Clients
     *
     */
    static public class PushClients {

    }
    /**
     * Constructor to initialize ActorRef
     *
     * @param out
     * @throws TwitterException
     */
    public ProfileActor(ActorRef out) throws TwitterException {
        this.out = out;
    }



    @Override
    public void preStart() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                new SearchActor.PushClients();
            }
        }, 0, 1000);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match( SearchActor.RegisterMessage.class,message -> userActors.add(sender()))
                .match( SearchActor.PushClients.class,message -> sendPush())
                .build();

    }

    /**
     * Method to push tweeter updates realtime
     *
     */
    //TODO: need to identify a way to stream in realtime
    void sendPush() {
        userActors.forEach(ar -> ar.tell("hi", self()));
    }
}
