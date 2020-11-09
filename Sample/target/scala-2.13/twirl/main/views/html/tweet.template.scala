
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

    </head>
    <body>
    
    <ul>
        """),_display_(/*9.10*/for(p <- resultList) yield /*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""
  """),format.raw/*10.3*/("""<li>"""),_display_(/*10.8*/p),format.raw/*10.9*/(""" """),format.raw/*10.10*/("""</li>
""")))}),format.raw/*11.2*/("""

	"""),format.raw/*13.2*/("""</ul>
        
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
                  DATE: 2020-11-08T17:20:45.181360400
                  SOURCE: C:/AM PC/AM/Concordia/Courses/0-soen-6441-app/playframework/play-samples-play-java-hello-world-tutorial/app/views/tweet.scala.html
                  HASH: 03b0b10aaeac8a5d947513dfdd34662bc1faec99
                  MATRIX: 913->1|1034->27|1062->29|1160->101|1195->121|1234->123|1265->127|1296->132|1317->133|1346->134|1384->142|1416->147
                  LINES: 27->1|32->1|33->2|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|44->13
                  -- GENERATED --
              */
          