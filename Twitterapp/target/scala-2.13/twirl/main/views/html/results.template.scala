
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object results extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
<head>
    <title>My search results</title>
    <link rel="stylesheet" href='"""),_display_(/*5.35*/routes/*5.41*/.Assets.versioned("stylesheets/results.css")),format.raw/*5.85*/("""'>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="modal-container"></div>
<div class="container">
    <div class="back-results-arrow-container">
        <div class="back-arrow-image" onclick="goTo('index')"><img src="assets/images/arrow.svg"></div>
        <div class="back-arrow-text">Your search results</div>
    </div>
    <div class="search-container">
        <div class="search-container-name">Search Terms</div>
        <div class="search-input">
            <input type="text" placeholder="Search Here" value="Montreal Sushi">
        </div>
        <div class="search-image"><img src="assets/images/search.svg"></div>
    </div>
    <div class="search-result-stats">
        <div class="search-result-count-title">Search Results:&nbsp;</div>
        <div class="search-result-count">10</div>
        &nbsp;&nbsp;| &nbsp;&nbsp;
        <div class="search-result-sentiment-title">Overall Sentiment:&nbsp;</div>
        <div class="search-result-sentiment">&#128512; Happy</div>
    </div>

    <div class="results-container" ></option>
        <div class="result-container">
            <div class="result-index">1</div>
            <div class="result">
                <div class="result-title" onclick="goTo('profile.html')">results:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">2</div>
            <div class="result">
                <div class="result-title">r.twitterName:</div>
                <div class="result-title"></div>
                <div class="result-content">
                </div>
            </div>
        </div>


        <div class="result-container">
            <div class="result-index">3</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">4</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">5</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">6</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">7</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">8</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">9</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index" id="test1">10</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>
    </div>
</div>

<button onclick="test()">test</button>
<script>

    function test()"""),format.raw/*144.20*/("""{"""),format.raw/*144.21*/("""
      """),format.raw/*145.7*/("""alert("JQ Test");
      $("#test").html("testtesttest")
      """),format.raw/*147.7*/("""}"""),format.raw/*147.8*/("""


  """),format.raw/*150.3*/("""function goTo(url)
  """),format.raw/*151.3*/("""{"""),format.raw/*151.4*/("""
    """),format.raw/*152.5*/("""location.replace(url);
  """),format.raw/*153.3*/("""}"""),format.raw/*153.4*/("""

  """),format.raw/*155.3*/("""function showmodal(id,category)"""),format.raw/*155.34*/("""{"""),format.raw/*155.35*/("""
    """),format.raw/*156.5*/("""var url = "profile.html";
    $('.modal-container').load(url,"""),format.raw/*157.36*/("""{"""),format.raw/*157.37*/("""}"""),format.raw/*157.38*/(""",function(result)"""),format.raw/*157.55*/("""{"""),format.raw/*157.56*/("""
            """),format.raw/*158.13*/("""$('#myModal').modal("""),format.raw/*158.33*/("""{"""),format.raw/*158.34*/("""show:true"""),format.raw/*158.43*/("""}"""),format.raw/*158.44*/(""");
    """),format.raw/*159.5*/("""}"""),format.raw/*159.6*/(""");
  """),format.raw/*160.3*/("""}"""),format.raw/*160.4*/("""

  """),format.raw/*162.3*/("""</script>

</body>

</html>


"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-09T20:09:17.439265700
                  SOURCE: A:/New folder (3)/play-samples-play-java-hello-world-tutorial/app/views/results.scala.html
                  HASH: bc3cfd130594237d0c1cbb7a85104f918976abce
                  MATRIX: 902->1|998->4|1109->89|1123->95|1187->139|9123->8046|9153->8047|9188->8054|9278->8116|9307->8117|9340->8122|9389->8143|9418->8144|9451->8149|9504->8174|9533->8175|9565->8179|9625->8210|9655->8211|9688->8216|9778->8277|9808->8278|9838->8279|9884->8296|9914->8297|9956->8310|10005->8330|10035->8331|10073->8340|10103->8341|10138->8348|10167->8349|10200->8354|10229->8355|10261->8359
                  LINES: 27->1|32->2|35->5|35->5|35->5|174->144|174->144|175->145|177->147|177->147|180->150|181->151|181->151|182->152|183->153|183->153|185->155|185->155|185->155|186->156|187->157|187->157|187->157|187->157|187->157|188->158|188->158|188->158|188->158|188->158|189->159|189->159|190->160|190->160|192->162
                  -- GENERATED --
              */
          