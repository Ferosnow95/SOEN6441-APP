package controllers;

import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;
import scala.jdk.javaapi.CollectionConverters;
import services.WordsFrequencyService;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * @author Dinesh
 * 
 */
@Singleton
public class AsyncTwitterController extends Controller {
    private final AssetsFinder assetsFinder;

    private HttpExecutionContext exec;

    @Inject
    WordsFrequencyService wordsFrequencyService;

    @Inject
    public AsyncTwitterController(AssetsFinder assetsFinder, HttpExecutionContext exec) {
        this.exec = exec;
        this.assetsFinder = assetsFinder;
    }

    /**
     * to show index page
     * @return
     */
    public CompletionStage<Result> index() {
        return  CompletableFuture.supplyAsync(()-> Results.ok(views.html.frontend.index.render(assetsFinder)), exec.current());
    }

    /**
     * to retrieve 10 latest tweets data
     * @return
     */
    public CompletionStage<Result> results() {
        return  CompletableFuture.supplyAsync(()-> Results.ok(views.html.frontend.results.render(assetsFinder)), exec.current());
    }

    /**
     * to show twitter user's profile
     * @param userName
     * @param userID  twitter id
     * @return
     */
    public CompletionStage<Result> profile(String userName, String userID) {
        return  CompletableFuture.supplyAsync(()-> Results.ok(views.html.frontend.profile.render(assetsFinder)), exec.current());
    }

    /**
     * @param keyWords search term got through url parameter
     * @return each unique word frequency in descending order
     */
    public CompletionStage<Result> frequency(String keyWords) {
        return  CompletableFuture.supplyAsync(()-> Results.ok(views.html.frontend.frequency.render(keyWords,CollectionConverters.asScala(wordsFrequencyService.countFrequency(keyWords).iterator()).toSeq(),assetsFinder)), exec.current());
    }

}
