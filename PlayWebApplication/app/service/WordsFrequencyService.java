package service;

import models.WordsFrequency;
import twitter4j.TwitterException;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Collections.reverseOrder;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

/**
 * @author
 * @date 2020-11-04
 */
@Singleton
public class WordsFrequencyService {
    /**
     * WordsFrequencyService retrieves twitter content and calc each unique word's frequency, and sort in descending order.
     * @param keyWords the input search term
     * @return java stream
     */
    @Inject
    TwitterService twitterService;

    public Stream<WordsFrequency> countFrequency(String keyWords) {

        /**
         * After twitter content is retrieved ,process the content in steps:
         *  1.replace all the non letter with blank.
         *  2.concat 250 tweets content, then split the content by blank.
         *  3.calc each unique word frequency.
         *  4.convert Stream<Map> to Stream<WordsFrequency>.
         */
        try {
            return Arrays.stream(twitterService.searchTweets(keyWords,250).map(String::toLowerCase).map(s -> s.replaceAll("\\P{L}"," ")).collect(joining(" ")).split("\\s+"))
                    .collect(groupingBy(identity(), counting()))
                    .entrySet().stream().sorted(Map.Entry.comparingByValue(reverseOrder()))
                    .map(e-> new WordsFrequency(e.getKey(),e.getValue()));
        } catch (TwitterException e) {
            e.printStackTrace();
            return null;
        }


    }
}

