
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
                <div class="back-arrow-image" onclick="goBack()"><img src="assets/images/arrow.svg"></div>
                <div class="back-arrow-text">Your search results</div>
            </div>
            <div class="search-container">
                <div class="search-container-name">Search Terms</div>
                <div class="search-input">
                    <input type="text" name="keyword" name="search_text" id="searchInput"  placeholder="Search Here">
                </div>
                <button class="search-image" onclick="search()" ><img src="assets/images/search.svg"></button>
            </div>
            <div class="search-result-stats">
                <div class="search-result-count-title">Search Results:&nbsp;</div>
                <div class="search-result-count">10</div>
                &nbsp;&nbsp;| &nbsp;&nbsp;
                <div class="search-result-sentiment-title">Overall Sentiment:&nbsp;</div>
                <div class="search-result-sentiment">&#128512; Happy</div>
            </div>

            <ul>
                

                """),_display_(/*40.18*/for(p <- resultList) yield /*40.38*/ {_display_(Seq[Any](format.raw/*40.40*/("""
        
        
          """),format.raw/*43.11*/("""<li href="javascript:alert('You clicked!')">"""),_display_(/*43.56*/p),format.raw/*43.57*/(""" """),format.raw/*43.58*/("""</li>
        """)))}),format.raw/*44.10*/("""
        
            """),format.raw/*46.13*/("""</ul>
            </div>
        
    
  
<script>

    function goTo(url)
    """),format.raw/*54.5*/("""{"""),format.raw/*54.6*/("""
      """),format.raw/*55.7*/("""location.replace(url);
    """),format.raw/*56.5*/("""}"""),format.raw/*56.6*/("""
  
    
    """),format.raw/*59.5*/("""function getprofile() """),format.raw/*59.27*/("""{"""),format.raw/*59.28*/("""

        """),format.raw/*61.9*/("""var profile = $("#searchInput").val()

        window.location.replace("profile/");
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/("""

    """),format.raw/*66.5*/("""function goBack() """),format.raw/*66.23*/("""{"""),format.raw/*66.24*/("""
        """),format.raw/*67.9*/("""window.location.replace("http://localhost:9000/");
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/("""

        """),format.raw/*70.9*/("""function search()"""),format.raw/*70.26*/("""{"""),format.raw/*70.27*/("""
  """),format.raw/*71.3*/("""var searchText = $("#searchInput").val()

  window.location.replace(searchText);
  """),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""

        
  
  
    """),format.raw/*79.5*/("""</script>
        
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
                  DATE: 2020-11-10T22:16:40.897461600
                  SOURCE: C:/PlayWebApplication/app/views/tweet.scala.html
                  HASH: 67ac67a2c52ccb64377d89317fff59f2d7f5fede
                  MATRIX: 913->1|1034->27|1062->29|1179->120|1193->126|1257->170|3153->2039|3189->2059|3229->2061|3289->2093|3361->2138|3383->2139|3412->2140|3459->2156|3511->2180|3625->2267|3653->2268|3688->2276|3743->2304|3771->2305|3814->2321|3864->2343|3893->2344|3932->2356|4054->2451|4083->2452|4118->2460|4164->2478|4193->2479|4230->2489|4317->2549|4346->2550|4385->2562|4430->2579|4459->2580|4490->2584|4603->2670|4631->2671|4684->2697
                  LINES: 27->1|32->1|33->2|36->5|36->5|36->5|71->40|71->40|71->40|74->43|74->43|74->43|74->43|75->44|77->46|85->54|85->54|86->55|87->56|87->56|90->59|90->59|90->59|92->61|95->64|95->64|97->66|97->66|97->66|98->67|99->68|99->68|101->70|101->70|101->70|102->71|105->74|105->74|110->79
                  -- GENERATED --
              */
          