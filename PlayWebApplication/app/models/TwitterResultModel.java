package models;

public class TwitterResultModel {

    private String twitterID;
    private String twitterName;
    private String tweetContent;
    private String hashTag;

    public String getTwitterID() {
        return twitterID;
    }

    public void setTwitterID(String twitterID) {
        this.twitterID = twitterID;
    }

    public String getTwitterName() {
        return twitterName;
    }

    public void setTwitterName(String twitterName) {
        this.twitterName = twitterName;
    }

    public String getTweetContent() {
        return tweetContent;
    }

    public void setTweetContent(String tweetContent) {
        this.tweetContent = tweetContent;
    }

    public String getHashTag() {
        return hashTag;
    }

    public void setHashTag(String hashTag) {
        this.hashTag = hashTag;
    }

    @Override
    public String toString() {
        return "TwitterResultModel{" +
                "twitterID='" + twitterID + '\'' +
                ", twitterName='" + twitterName + '\'' +
                ", tweetContent='" + tweetContent + '\'' +
                ", hashTag='" + hashTag + '\'' +
                '}';
    }
}
