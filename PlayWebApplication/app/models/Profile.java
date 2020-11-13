package models;

import java.util.ArrayList;

public class Profile {
  public String name;
  public String screenName;
  public String description;
  public int followers;
  public int following;
  public String link;
  public String dateJoined;
  public ArrayList<Tweet> tweets;
  public String imageLink;



  public Profile(
    String name, 
    String screenName, 
    String description, 
    int followers, 
    int following, 
    String link, 
    String dateJoined, 
    ArrayList<Tweet> tweets,
    String imageLink)
  {
      this.name         = name;
      this.screenName   = screenName;
      this.description  = description;
      this.followers    = followers;
      this.following    = following;
      this.link         = link;
      this.dateJoined   = dateJoined;
      this.tweets       = tweets;
      this.imageLink    = imageLink;
  }
}