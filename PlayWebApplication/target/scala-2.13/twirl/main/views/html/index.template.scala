
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
    <img src="assets/images/top-icon.svg">
  </div>
  <div class="welcome-title">Welcome To Tweet Analytics</div>
  <div class="welcome-subtitle">Start searching tweets</div>




  <div class="search-container">
    <div class="search-input">

      <input type="text" name="keyword" name="search_text" id="searchInput" placeholder="Search Here">
    </div>

    <button class="search-image" onclick="search()" ><img src="assets/images/search.svg"> Search</button>
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
                  DATE: 2020-11-10T20:10:20.955992200
                  SOURCE: D:/uni Projects/PlayWebApplication/app/views/index.scala.html
                  HASH: 79d61f49479728043ce92c89c3d9f30591488b8d
                  MATRIX: 900->1|996->4|1024->6|1634->589|1649->595|1713->638|2524->1422|2552->1423|2584->1428|2636->1453|2664->1454|2695->1458|2740->1475|2769->1476|2799->1479|2924->1577|2952->1578|2985->1584
                  LINES: 27->1|32->2|34->4|44->14|44->14|44->14|84->54|84->54|85->55|86->56|86->56|88->58|88->58|88->58|89->59|92->62|92->62|96->66
                  -- GENERATED --
              */
          