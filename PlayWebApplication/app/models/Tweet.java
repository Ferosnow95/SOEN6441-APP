package models;

public class Tweet {
  public long id;
  public String screenName;
  public String content;
  public String date;

  public Tweet(long id, String screenName, String content, String date)
  {
      this.id         = id;
      this.screenName = screenName;
      this.content    = content;
      this.date       = date;
  }
}