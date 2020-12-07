package models;


/**
 *  Tweet Constructor
 * @author Ali Zafar Iqbal
 */

public class Tweet {
  public String screenName;
  public String content;
  public String date;

  public Tweet(String screenName, String content, String date)
  {
      this.screenName = screenName;
      this.content    = content;
      this.date       = date;
  }
}