
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


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*4.1*/("""<html>
<head>
    <title>My search results</title>
    <link rel="stylesheet" href='"""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("stylesheets/results.css")),format.raw/*7.85*/("""'>

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
                <div class="result-title" onclick="goTo('profile.html')">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                </div>
            </div>
        </div>

        <div class="result-container">
            <div class="result-index">2</div>
            <div class="result">
                <div class="result-title">Tweeter Handle:</div>
                <div class="result-content">
                    Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
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

    function test()"""),format.raw/*145.20*/("""{"""),format.raw/*145.21*/("""
      """),format.raw/*146.7*/("""alert("JQ Test");
      $("#test").html("testtesttest")
      """),format.raw/*148.7*/("""}"""),format.raw/*148.8*/("""


  """),format.raw/*151.3*/("""function goTo(url)
  """),format.raw/*152.3*/("""{"""),format.raw/*152.4*/("""
    """),format.raw/*153.5*/("""location.replace(url);
  """),format.raw/*154.3*/("""}"""),format.raw/*154.4*/("""

  """),format.raw/*156.3*/("""function showmodal(id,category)"""),format.raw/*156.34*/("""{"""),format.raw/*156.35*/("""
    """),format.raw/*157.5*/("""var url = "profile.html";
    $('.modal-container').load(url,"""),format.raw/*158.36*/("""{"""),format.raw/*158.37*/("""}"""),format.raw/*158.38*/(""",function(result)"""),format.raw/*158.55*/("""{"""),format.raw/*158.56*/("""
            """),format.raw/*159.13*/("""$('#myModal').modal("""),format.raw/*159.33*/("""{"""),format.raw/*159.34*/("""show:true"""),format.raw/*159.43*/("""}"""),format.raw/*159.44*/(""");
    """),format.raw/*160.5*/("""}"""),format.raw/*160.6*/(""");
  """),format.raw/*161.3*/("""}"""),format.raw/*161.4*/("""

  """),format.raw/*163.3*/("""</script>

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
                  DATE: 2020-11-04T17:18:01.633653900
                  SOURCE: D:/uni Projects/PlayWebApplication/app/views/results.scala.html
                  HASH: a17dccd34a223da6325fd11f85f5dde0cfd55d26
                  MATRIX: 902->1|998->4|1026->6|1137->91|1151->97|1215->141|9473->8370|9503->8371|9538->8378|9628->8440|9657->8441|9690->8446|9739->8467|9768->8468|9801->8473|9854->8498|9883->8499|9915->8503|9975->8534|10005->8535|10038->8540|10128->8601|10158->8602|10188->8603|10234->8620|10264->8621|10306->8634|10355->8654|10385->8655|10423->8664|10453->8665|10488->8672|10517->8673|10550->8678|10579->8679|10611->8683
                  LINES: 27->1|32->2|34->4|37->7|37->7|37->7|175->145|175->145|176->146|178->148|178->148|181->151|182->152|182->152|183->153|184->154|184->154|186->156|186->156|186->156|187->157|188->158|188->158|188->158|188->158|188->158|189->159|189->159|189->159|189->159|189->159|190->160|190->160|191->161|191->161|193->163
                  -- GENERATED --
              */
          