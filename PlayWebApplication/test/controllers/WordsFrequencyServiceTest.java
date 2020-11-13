package controllers;

import models.WordsFrequency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import play.test.WithApplication;

import service.TwitterService;
import service.WordsFrequencyService;
import twitter4j.TwitterException;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.when;

/**
 * @author
 * Used to test WordsFrequencyService countFrequency() method.
 * Unit testing does not require Play application start up.
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class WordsFrequencyServiceTest extends WithApplication {

    @Mock
    TwitterService twitterService;

    @InjectMocks
    WordsFrequencyService wordsFrequencyService;

    @Test
    public void testWordsFrequencyService() throws TwitterException {

        Stream<String> mockedStream = Arrays.stream(new String[]{"Java java JAVA.",
                "Play play.",
                "sbt"
        });

        /**
         * mock searchTweets function to avoid invoking real twitter search api.
         */
        when(twitterService.searchTweets("java",250)).thenReturn(mockedStream);

        WordsFrequency[] expected = {new WordsFrequency("java", (long) 3),
                new WordsFrequency("play", (long) 2),
                new WordsFrequency("sbt", (long) 1)};

        assertThat(wordsFrequencyService.countFrequency("java")).containsExactly(expected);


    }


}