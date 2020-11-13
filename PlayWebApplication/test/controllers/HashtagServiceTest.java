package controllers;

import models.Tweet;
import models.TwitterResultModel;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import service.HashtagService;
import twitter4j.TwitterException;

import java.util.Arrays;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HashtagServiceTest {

      @Mock
      HashtagService hashtagService;

    @BeforeEach
            void getData() throws TwitterException {
                when(hashtagService.searchByHashTag("java")).thenReturn(expected);}


       List<String> hashTagsTrue= Arrays.asList("#java");
       List<String> hashTagsFales= Arrays.asList("#canada");


    public List<Tweet> expected = Arrays.asList(
            new Tweet("@gurshD"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new Tweet("@ali"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new Tweet("@oracle"," the best way to prectice java", hashTagsTrue)

    );
    public List<Tweet> expected1 = Arrays.asList(
            new Tweet("@gurshD"," A great book for non-tech folk hoping to learn programming", hashTagsTrue)
    );
    public List<Tweet> notExpected = Arrays.asList(
            new Tweet("@sarah"," concordia university in canada", hashTagsFales),
            new Tweet("@john"," canada accident rate", hashTagsFales)

    );

    public List<Tweet> data = Arrays.asList(
            new Tweet("@gurshD"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new Tweet("@ali"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new Tweet("@oracle"," the best way to prectice java", hashTagsTrue),
            new Tweet("@sarah"," concordia university in canada", hashTagsFales),
            new Tweet("@john"," canada accident rate", hashTagsFales)

    );



    /**
     * @author Negin
     * @throws Exception
     */
    @Test
    public void searchByHashTag() throws Exception {



        assertThat(hashtagService.searchByHashTag("java")).containsExactly((Tweet) expected1);

//        assertNotSame(twitterService.searchByHashTag("java"),notExpected);
    }




}
