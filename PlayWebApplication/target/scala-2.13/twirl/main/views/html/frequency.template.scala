
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

object frequency extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Seq[WordsFrequency],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchTerm:String)(implicit wordFrequency: Seq[WordsFrequency]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
    <title>My search results</title>
    <link rel="stylesheet" href='"""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/css/results.css")),format.raw/*6.89*/("""'>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
            table, th, td """),format.raw/*9.27*/("""{"""),format.raw/*9.28*/("""
                """),format.raw/*10.17*/("""border: 1px solid black;

            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/("""
            """),format.raw/*13.13*/("""table """),format.raw/*13.19*/("""{"""),format.raw/*13.20*/("""
                """),format.raw/*14.17*/("""border-spacing: 0px;
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""
        """),format.raw/*16.9*/("""</style>
</head>
<body>
<h1 style="margin-left: 50px">Word Frequency Statistics</h1>
<h3 style="margin-left: 50px">Search Term: """),_display_(/*20.45*/searchTerm),format.raw/*20.55*/("""</h3>

<table style="margin-left: 50px">
    <thead>
    <tr><th>Word</th><th>Freqency</th>
    </thead>
    <tbody>
    """),_display_(/*27.6*/for(w <- wordFrequency) yield /*27.29*/ {_display_(Seq[Any](format.raw/*27.31*/("""
    """),format.raw/*28.5*/("""<tr>
        <td style="text-align: center">"""),_display_(/*29.41*/w/*29.42*/.word),format.raw/*29.47*/("""</td><td style="text-align: center">"""),_display_(/*29.84*/w/*29.85*/.frequency),format.raw/*29.95*/("""</td>
    </tr>
    """)))}),format.raw/*31.6*/("""
    """),format.raw/*32.5*/("""</tbody>
</table>
</body>

</html>
"""))
      }
    }
  }

  def render(searchTerm:String,wordFrequency:Seq[WordsFrequency]): play.twirl.api.HtmlFormat.Appendable = apply(searchTerm)(wordFrequency)

  def f:((String) => (Seq[WordsFrequency]) => play.twirl.api.HtmlFormat.Appendable) = (searchTerm) => (wordFrequency) => apply(searchTerm)(wordFrequency)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-13T20:21:43.170498100
                  SOURCE: D:/uni Projects/Git/New folder/SOEN6441-APP/PlayWebApplication/app/views/frequency.scala.html
                  HASH: c9b12e3a66948726d801289d19d9a2671652605a
                  MATRIX: 931->1|1089->66|1116->67|1227->152|1241->158|1309->206|1452->322|1480->323|1525->340|1591->378|1620->379|1661->392|1695->398|1724->399|1769->416|1830->449|1859->450|1895->459|2051->588|2082->598|2230->720|2269->743|2309->745|2341->750|2413->795|2423->796|2449->801|2513->838|2523->839|2554->849|2605->870|2637->875
                  LINES: 27->1|32->2|33->3|36->6|36->6|36->6|39->9|39->9|40->10|42->12|42->12|43->13|43->13|43->13|44->14|45->15|45->15|46->16|50->20|50->20|57->27|57->27|57->27|58->28|59->29|59->29|59->29|59->29|59->29|59->29|61->31|62->32
                  -- GENERATED --
              */
          