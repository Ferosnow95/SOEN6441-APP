
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""


"""),format.raw/*4.1*/("""<html>
<head>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

  <title>My search page</title>
  <link rel="stylesheet" href='"""),_display_(/*14.33*/routes/*14.39*/.Assets.versioned("stylesheets/search.css")),format.raw/*14.82*/("""'>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>


<div class="container">
  <div class="top-image">
    <img src="/assets/images/top-icon.svg">
  </div>
  <div class="welcome-title">Welcome To Tweet Analytics</div>
  <div class="welcome-subtitle">Start searching tweets</div>




  <div class="search-container">
    <div class="search-input">

      <input type="text" name="keyword" name="search_text" id="searchInput" placeholder="Search Here">
    </div>

    <div class="search-image" onclick="search()" ><img src="/assets/images/search.svg"> Search</div>
  </div>



  <div class="welcome-footer">
    <div>Team Project</div>
    <div>Team HG.005</div>
    <div>SOEN 6441</div>
  </div>


  <p id="demo"></p>

</div>



<script>
  var input = document.getElementById("searchInput");
  function search()"""),format.raw/*56.20*/("""{"""),format.raw/*56.21*/("""
    """),format.raw/*57.5*/("""if(input.value.trim() !== '')
    """),format.raw/*58.5*/("""{"""),format.raw/*58.6*/("""
      """),format.raw/*59.7*/("""window.location.replace("tweetSearch/"+input.value);
    """),format.raw/*60.5*/("""}"""),format.raw/*60.6*/("""
  """),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""


"""),format.raw/*64.1*/("""input.addEventListener("keyup", function(event) """),format.raw/*64.49*/("""{"""),format.raw/*64.50*/("""
  """),format.raw/*65.3*/("""if (event.keyCode === 13) """),format.raw/*65.29*/("""{"""),format.raw/*65.30*/("""
    """),format.raw/*66.5*/("""event.preventDefault();
    search();
  """),format.raw/*68.3*/("""}"""),format.raw/*68.4*/("""
"""),format.raw/*69.1*/("""}"""),format.raw/*69.2*/(""");


  </script>
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
                  DATE: 2020-11-13T16:25:58.654843400
                  SOURCE: D:/uni Projects/Git/New folder/SOEN6441-APP/PlayWebApplication/app/views/index.scala.html
                  HASH: ad54c4d2eb106fa5969b2ca521d3f63375233f88
                  MATRIX: 900->1|996->3|1028->9|1648->602|1663->608|1727->651|2648->1544|2677->1545|2710->1551|2772->1586|2800->1587|2835->1595|2920->1653|2948->1654|2979->1658|3007->1659|3040->1665|3116->1713|3145->1714|3176->1718|3230->1744|3259->1745|3292->1751|3361->1793|3389->1794|3418->1796|3446->1797
                  LINES: 27->1|32->1|35->4|45->14|45->14|45->14|87->56|87->56|88->57|89->58|89->58|90->59|91->60|91->60|92->61|92->61|95->64|95->64|95->64|96->65|96->65|96->65|97->66|99->68|99->68|100->69|100->69
                  -- GENERATED --
              */
          