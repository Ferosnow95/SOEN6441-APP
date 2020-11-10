
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

object tweet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resultList: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title>My search results</title>
        <link rel="stylesheet" href='"""),_display_(/*5.39*/routes/*5.45*/.Assets.versioned("stylesheets/results.css")),format.raw/*5.89*/("""'>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>


    <body>
    <div class="container">
    <div class="back-results-arrow-container">
        <div class="back-arrow-image" onclick="goTo('index')"><img src="assets/images/arrow.svg"></div>
        <div class="back-arrow-text">Your search results</div>
    </div>
    <div class="search-container">
        <div class="search-container-name">Search Terms</div>
        <div class="search-input">
            <input type="text" name="keyword" placeholder="Search Here" value="Montreal Sushi">
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



    <ul>
        """),_display_(/*41.10*/for(p <- resultList) yield /*41.30*/ {_display_(Seq[Any](format.raw/*41.32*/("""
  """),format.raw/*42.3*/("""<li>"""),_display_(/*42.8*/p),format.raw/*42.9*/(""" """),format.raw/*42.10*/("""</li>
""")))}),format.raw/*43.2*/("""

	"""),format.raw/*45.2*/("""</ul>

    </body>

</html>
"""))
      }
    }
  }

  def render(resultList:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(resultList)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (resultList) => apply(resultList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-09T20:09:17.455268900
                  SOURCE: A:/New folder (3)/play-samples-play-java-hello-world-tutorial/app/views/tweet.scala.html
                  HASH: 6ab5b44af746dfcb3bb796cd3d6dbd74b458af89
                  MATRIX: 913->1|1034->27|1062->29|1188->129|1202->135|1266->179|2922->1808|2958->1828|2998->1830|3029->1834|3060->1839|3081->1840|3110->1841|3148->1849|3180->1854
                  LINES: 27->1|32->1|33->2|36->5|36->5|36->5|72->41|72->41|72->41|73->42|73->42|73->42|73->42|74->43|76->45
                  -- GENERATED --
              */
          