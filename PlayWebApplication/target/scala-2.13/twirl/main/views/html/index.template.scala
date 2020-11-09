
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
"""),format.raw/*3.1*/("""<html>
<head>
  <title>My search page</title>
  <link rel="stylesheet" href='"""),_display_(/*6.33*/routes/*6.39*/.Assets.versioned("stylesheets/search.css")),format.raw/*6.82*/("""'>
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
      <input type="text" name="search_text" placeholder="Search Here">
    </div>
    <div class="search-image" onclick="goTo('results.html')" ><img src="assets/images/search.svg"></div>
  </div>



  <div class="welcome-footer">
    <div>Team Project</div>
    <div>Team HG.005</div>
    <div>SOEN 6441</div>
  </div>
</div>

<script>

  function goTo(url)
  """),format.raw/*35.3*/("""{"""),format.raw/*35.4*/("""
    """),format.raw/*36.5*/("""location.replace(url);
  """),format.raw/*37.3*/("""}"""),format.raw/*37.4*/("""
  """),format.raw/*38.3*/("""</script>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-09T23:18:44.965906900
                  SOURCE: D:/uni Projects/PlayWebApplication/app/views/index.scala.html
                  HASH: 20597f7bd0a0da4264b4e9d3148b5d10db10daaa
                  MATRIX: 900->1|996->4|1023->5|1127->83|1141->89|1204->132|1971->872|1999->873|2031->878|2083->903|2111->904|2141->907
                  LINES: 27->1|32->2|33->3|36->6|36->6|36->6|65->35|65->35|66->36|67->37|67->37|68->38
                  -- GENERATED --
              */
          