package models;

/**
 * model
 * @author Dinesh
 * 
 */
public class SearchResult {
    public String twitterID;
    public String twitterName;
    public String tweetContent;

    public SearchResult(String twitterID, String twitterName, String tweetContent) {
        this.twitterID = twitterID;
        this.twitterName = twitterName;
        this.tweetContent = tweetContent;
    }
}
