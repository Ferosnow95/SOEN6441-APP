package controllers;

import models.Tweet;
import models.Profile;
import models.TweetHandler;
import models.TwitterResultModel;
import play.api.data.Form;
import play.api.data.Forms;
import play.mvc.*;
import service.TweetService;
import twitter4j.*;
import javax.inject.Inject;
import javax.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import scala.jdk.javaapi.CollectionConverters;

import static java.util.stream.Collectors.toList;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */

public class HomeController extends Controller {


    private TweetService tweetService = new TweetService();

    public HomeController() throws TwitterException {
    }

    public Result tweetSearch(String keyWords) {

        ArrayList<Tweet> tweetList= tweetService.getTweets(keyWords);
        return ok(views.html.tweet.render(tweetList));

    }

    public Result index() {

//        Form<String> keyword= form(String.class);
//        form(TwitterResultModel.class).bindFromRequest();



        return ok(views.html.index.render());
    }


     public Result profile(String user) { 
        Profile userProfile = tweetService.getProfile(user);
         return ok(views.html.profile.render(userProfile));
     }
    public Result explore() {
        return ok("hello");
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
