package controllers;

import org.junit.Test;
import play.test.WithApplication;
import play.twirl.api.Content;
import static org.junit.Assert.*;
import javax.swing.text.AbstractDocument;

public class MyTest  extends WithApplication {
     @Test
    public void renderTemplate(){
         Content html= views.html.index.render();
         assertEquals("text/html",html.contentType());
         assertEquals(html.body().contains("Welcome To Tweet Analytic"),true);

     }

}
