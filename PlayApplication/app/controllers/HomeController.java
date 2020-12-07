package controllers;

import akka.actor.*;
import akka.stream.Materializer;

import akka.stream.javadsl.Flow;
import com.fasterxml.jackson.databind.JsonNode;
import models.Tweet;
import models.Profile;
import play.libs.F;
import play.libs.streams.ActorFlow;
import play.mvc.*;
import service.ProfileActor;
import service.TweetService;
import service.UserActor;
import twitter4j.*;
import javax.inject.Inject;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class HomeController extends Controller {

    private ActorSystem actorSystem;
    private Materializer materializer;


    /**
     * Constructor to initialize ActorSystem and Materializer
     *
     * @param actorSystem
     * @param materializer
     * @throws TwitterException
     */
    @Inject
    public HomeController(ActorSystem actorSystem, Materializer materializer) throws TwitterException {
        this.actorSystem = actorSystem;
        this.materializer = materializer;
    }

    /**
     * TweetSearch Controller
     * @author Ali Zafar Iqbal
     * @date 2020-11-13
     * @return Tweet Search Render
     */

    public Result tweetSearch(Http.Request request, String keyWords) {
        String url = routes.HomeController.searchSocket().webSocketURL(request);
        ArrayList<Tweet> tweetList= TweetService.getTweets(keyWords);
        return ok(views.html.tweet.render(url, keyWords, tweetList));
    }

    public Result index() {

//        Form<String> keyword= form(String.class);
//        form(TwitterResultModel.class).bindFromRequest();
//        String url = routes.HomeController.searchSocket()
//                .webSocketURL(request);
        return ok(views.html.index.render());
    }

//    public Result index(Http.Request request) {
//        String url = routes.HomeController.searchSocket().webSocketURL(request);
//        //To test WebSockets with akka streams, uncomment the next line and comment out the previous
//        //String url = routes.HomeController.akkaStreamsSocket().webSocketURL(request);
//        return ok(views.html.index.render(url));
//    }


    /**
     * Profile Controller
     *
     * @author Ali Zafar Iqbal
     * @date 2020-11-13
     * @return Profile Page Render
     */


    public Result profile(String user) {
        Profile userProfile = TweetService.getProfile(user);
        return ok(views.html.profile.render(userProfile));
    }
    public Result explore() {
        return ok("hello");
    }
//
//    public Result explore() {
//        return ok("hello");
//    }
//
//
//



//    private Flow<String, String, ?> createFlowForActor() {
//        return ActorFlow.actorRef(out -> SearchActor.props(out),
//                actorSystem, materializer);
//    }
//
//    private CompletionStage<F.Either<Result, Flow<String, String, ?>>>
//    createActorFlow(Http.RequestHeader request) {
//        return CompletableFuture.completedFuture(
//                F.Either.Right(createFlowForActor()));
//    }
//
//
//    public WebSocket searchSocket() {
//        return WebSocket.Text
//                .acceptOrResult(this::createActorFlow);
//    }

    /**
     * Web socket for tweet search
     *
     * @return
     */
    public WebSocket searchSocket() {
        return WebSocket.Json.acceptOrResult(this::createActorFlow);
        //request -> ActorFlow.actorRef(UserActor::props, actorSystem, materializer)
    }

    private CompletionStage<F.Either<Result, Flow<JsonNode, JsonNode, ?>>> createActorFlow(Http.RequestHeader request) {
        return CompletableFuture.completedFuture(
                F.Either.Right(createFlowForActor()));
    }

    private Flow<JsonNode, JsonNode, ?> createFlowForActor() {
        return ActorFlow.actorRef(UserActor::props,
                actorSystem, materializer);
    }

    /**
     * Web socket for profile selection
     *
     * @return
     */
    public WebSocket profileSocket() {
        return WebSocket.Text.accept(
                request -> ActorFlow.actorRef(ProfileActor::props, actorSystem, materializer));
    }

//    private final AssetsFinder assetsFinder;
//
//    private HttpExecutionContext exec;
//
//    @Inject
//    public HomeController(AssetsFinder assetsFinder, HttpExecutionContext exec) {
//        this.exec = exec;
//        this.assetsFinder = assetsFinder;
//
//
//        public Result index () {
//            return ok(views.html.index.render());
//        }
////        public CompletionStage<Result> results (List < TwitterResultModel > results) {
////
////            return CompletableFuture.supplyAsync(() -> {
////                try {
////                    return Results.ok(views.html.results.render(results, CollectionConverters.asScala(TweetHandler.searchByHashTag("#montreal").iterator()).toSeq(), assetsFinder));
////                } catch (TwitterException e) {
////                    e.printStackTrace();
////                    return 0;
////                }
////            }, exec.current());
////
////        }
//    }
//    public Result results() throws TwitterException {
////        int count=1;
////        String keyWords = "#montreal";
////        List<Status> tweets1= searchByHashTag(keyWords);
////        for(Status tweet : tweets1) {
////
////            System.out.println("Tweet "+ count+ " . "+ tweet.getUser().getName() + ":" + tweet.getText() +"  "+ tweet.getHashtagEntities());
////            count++;
////        }
//
//        return  ok(views.html.results.render());
//    }

}
