
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
  <title>My search page</title>
  <link rel="stylesheet" href='"""),_display_(/*7.33*/routes/*7.39*/.Assets.versioned("stylesheets/search.css")),format.raw/*7.82*/("""'>
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
      <input type="text" placeholder="Search Here">
    </div>
    <div class="search-image" onclick="goTo('results')"><img src="assets/images/search.svg"></div>
  </div>
  <div class="welcome-footer">
    <div>Team Project</div>
    <div>Team HG.005</div>
    <div>SOEN 6441</div>
  </div>
</div>
<script>
  function goTo(url)
  """),format.raw/*31.3*/("""{"""),format.raw/*31.4*/("""
    """),format.raw/*32.5*/("""location.replace(url);
  """),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""
  """),format.raw/*34.3*/("""</script>
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
                  DATE: 2020-11-04T17:15:04.327850100
                  SOURCE: D:/uni Projects/PlayWebApplication/app/views/index.scala.html
                  HASH: 0a2eca6502adc740063fc3a8d3fb7966a00d98b0
                  MATRIX: 900->1|996->4|1024->6|1128->84|1142->90|1205->133|1942->843|1970->844|2002->849|2054->874|2082->875|2112->878
                  LINES: 27->1|32->2|34->4|37->7|37->7|37->7|61->31|61->31|62->32|63->33|63->33|64->34
                  -- GENERATED --
              */
          