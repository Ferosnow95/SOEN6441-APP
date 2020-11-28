
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


Seq[Any](format.raw/*2.1*/("""

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
                  DATE: 2020-11-28T09:47:31.660903200
                  SOURCE: S:/New folder (2)/Changed/PlayWebApplication/app/views/index.scala.html
                  HASH: 60b8184634238438d1bcf60779da08b67cf63224
                  MATRIX: 900->1|996->4|1024->6|1634->589|1649->595|1713->638|2592->1489|2621->1490|2653->1495|2714->1529|2742->1530|2776->1537|2860->1594|2888->1595|2918->1598|2946->1599|2976->1602|3052->1650|3081->1651|3111->1654|3165->1680|3194->1681|3226->1686|3293->1726|3321->1727|3349->1728|3377->1729
                  LINES: 27->1|32->2|34->4|44->14|44->14|44->14|86->56|86->56|87->57|88->58|88->58|89->59|90->60|90->60|91->61|91->61|94->64|94->64|94->64|95->65|95->65|95->65|96->66|98->68|98->68|99->69|99->69
                  -- GENERATED --
              */
          