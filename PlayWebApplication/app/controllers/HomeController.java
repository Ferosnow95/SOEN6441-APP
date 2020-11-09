package controllers;

import play.mvc.*;
import twitter4j.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static models.TweetHandler.searchByHashTag;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The     * this method will be called when the application receives a
     *   configuration in the <code>routes</code> file means that
    * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(@Required String search_text) {
        return  ok(views.html.index.render());
    }
    public Result results() throws TwitterException {
        int count=1;
        String keyWords = "#montreal";
        List<Status> tweets1= searchByHashTag(keyWords);
        for(Status tweet : tweets1) {
            System.out.println("Tweet "+ count+ " . "+ tweet.getUser().getName() + ":" + tweet.getText() +"  "+ tweet.getHashtagEntities());
            count++;
        }

        return  ok(views.html.results.render());
    }

}
