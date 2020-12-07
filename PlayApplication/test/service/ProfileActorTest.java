package service;


import akka.testkit.javadsl.TestKit;
import models.TweetQuery;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import java.time.Duration;

public class ProfileActorTest {
  static ActorSystem system;

  @BeforeClass
  public static void setup() {
    system = ActorSystem.create();
  }

  @AfterClass
  public static void teardown() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void testIt() {
    /*
     * Wrap the whole test procedure within a testkit constructor
     * if you want to receive actor replies or use Within(), etc.
     */
    new TestKit(system) {
      {
        final Props props = Props.create(ProfileActor.class, getRef());
        final ActorRef profileActor = system.actorOf(props);

        // can also use JavaTestKit “from the outside”
        final TestKit probe = new TestKit(system);
        // “inject” the probe by passing it to the test subject
        // like a real resource would be passed in production
          ActorRef testRef = getRef();
          profileActor.tell(new ProfileActor.RegisterMessage(), testRef);
          expectNoMessage();

        // the run() method needs to finish within 3 seconds
        within(
            Duration.ofSeconds(3),
            () -> {
                TweetQuery query = new TweetQuery();
                profileActor.tell(query, getRef());
                expectNoMessage();
              return null;
            });
      }
    };
  }
}