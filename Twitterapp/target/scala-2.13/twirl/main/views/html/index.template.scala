
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
  <link rel="stylesheet" href="css/search.css">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">3
</head>
<body>


<div class="container">
  <div class="top-image">
    <img src="assets/top-icon.svg">
  </div>
  <div class="welcome-title">Welcome To Tweet Analytics</div>
  <div class="welcome-subtitle">Start searching tweets</div>




  <div class="search-container">
    <div class="search-input">

      <input type="text" name="keyword" name="search_text" id="searchInput" placeholder="Search Here">
    </div>

    <button class="search-image" onclick="search()" ><img src="assets/search.svg"> Search</button>
  </div>



  <div class="welcome-footer">
    <div>Team Project</div>
    <div>Team HG.005</div>
    <div>SOEN 6441</div>
  </div>

</div>



<script>

  function goTo(url)
  """),format.raw/*54.3*/("""{"""),format.raw/*54.4*/("""
    """),format.raw/*55.5*/("""location.replace(url);
  """),format.raw/*56.3*/("""}"""),format.raw/*56.4*/("""

  """),format.raw/*58.3*/("""function search()"""),format.raw/*58.20*/("""{"""),format.raw/*58.21*/("""
  """),format.raw/*59.3*/("""var searchText = $("#searchInput").val()

  window.location.replace("tweetSearch/"+searchText);
  """),format.raw/*62.3*/("""}"""),format.raw/*62.4*/("""



  """),format.raw/*66.3*/("""</script>
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
                  DATE: 2020-11-09T20:41:31.947335200
                  SOURCE: A:/New folder (3)/play-samples-play-java-hello-world-tutorial/app/views/index.scala.html
                  HASH: 5b5144b858d11a36a288c2afb288970f032fcf65
                  MATRIX: 900->1|996->4|1024->6|2418->1373|2446->1374|2478->1379|2530->1404|2558->1405|2589->1409|2634->1426|2663->1427|2693->1430|2818->1528|2846->1529|2879->1535
                  LINES: 27->1|32->2|34->4|84->54|84->54|85->55|86->56|86->56|88->58|88->58|88->58|89->59|92->62|92->62|96->66
                  -- GENERATED --
              */
          