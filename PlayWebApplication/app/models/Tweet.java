package models;

import twitter4j.HashtagEntity;
import twitter4j.Status;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Tweet {
  public long id;
  public String screenName;
  public String content;
  public String date;
  public List<String> hashTags;

    public Tweet() {
    }
    public Tweet(long id, String screenName, String content, String date)
    {
        this.id         = id;
        this.screenName = screenName;
        this.content    = content;
        this.date       = date;

    }

    public Tweet(long id, String screenName, String content, String date, List<String> hashTag)
  {
      this.id         = id;
      this.screenName = screenName;
      this.content    = content;
      this.date       = date;
      this.hashTags= hashTag;
  }

    public Tweet(String screenName, String content, List<String> hashTag)
    {
        this.screenName = screenName;
        this.content    = content;
        this.hashTags= hashTag;
    }



    public static Tweet reform(Status status) {

        Tweet tweet = new Tweet();
        tweet.id= status.getId();
        tweet.screenName=status.getUser().getScreenName();
        tweet.content= status.getText();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
        date.format(status.getCreatedAt());


        List<String> hashtages = new ArrayList<>();
        HashtagEntity[] tags = status.getHashtagEntities();
        if (tags != null && tags.length > 0) {
            for (HashtagEntity tag : tags) {
                hashtages.add("#" + tag.getText());
            }
        }
        tweet.hashTags=hashtages;

        return tweet;
    }
}