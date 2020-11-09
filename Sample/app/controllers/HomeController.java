package controllers;
import service.*;

import java.util.ArrayList;

import java.util.List;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
	
	private TweetService tweetService = new TweetService();
	
	 public Result tweetSearch(String keyWords) {
		ArrayList<String> tweetList= tweetService.getTweets(keyWords);
		
	        return ok(views.html.tweet.render(tweetList));
	    }
	
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

}
