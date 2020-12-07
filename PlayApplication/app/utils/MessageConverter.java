package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Tweet;
import models.TweetQuery;

public class MessageConverter {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    public static TweetQuery jsonNodeToTweetQuery(JsonNode jsonNode) {
        return OBJECT_MAPPER.convertValue(jsonNode, TweetQuery.class);
    }

    public static JsonNode queryToJsonNode(TweetQuery query) {
        return OBJECT_MAPPER.convertValue(query, JsonNode.class);
    }
    public static Tweet jsonNodeToTweet(JsonNode jsonNode) {
        return OBJECT_MAPPER.convertValue(jsonNode, Tweet.class);
    }

    public static JsonNode tweetToJsonNode(Tweet tweet) {
        return OBJECT_MAPPER.convertValue(tweet, JsonNode.class);
    }
}
