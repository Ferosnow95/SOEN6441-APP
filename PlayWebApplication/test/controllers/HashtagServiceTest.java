package controllers;

import models.Tweet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import service.HashtagService;

import java.util.Arrays;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


/**
 * tests hashtagService
 * @author Negin
 */
@RunWith(MockitoJUnitRunner.class)
public class HashtagServiceTest {

      @Mock
      HashtagService hashtagService;

       List<String> hashTagsTrue= Arrays.asList("#java");
       List<String> hashTagsFales= Arrays.asList("#canada");


    public List<Tweet> expected = Arrays.asList(
            new Tweet("@gurshD"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new Tweet("@ali"," A great book for non-tech folk hoping to learn programming", hashTagsTrue),
            new Tweet("@oracle"," the best way to prectice java", hashTagsTrue)

    );
    public Tweet expected1 =
            new Tweet("@gurshD"," A great book for non-tech folk hoping to learn programming", hashTagsTrue);

    public List<Tweet> notExpected = Arrays.asList(
            new Tweet("@sarah"," concordia university in canada", hashTagsFales),
            new Tweet("@john"," canada accident rate", hashTagsFales)

    );

    /** tests the searchByHashTag method in HashtagService
     * uses mockito to get data
     * @throws Exception
     */
    @Test
    public void searchByHashTag() throws Exception {

        when(hashtagService.searchByHashTag("java")).thenReturn(expected);

        assertEquals(hashtagService.searchByHashTag("java").size(),3);
        assertEquals(hashtagService.searchByHashTag("java"),expected);
        assertNotEquals(hashtagService.searchByHashTag("java"),notExpected);
    }




}
