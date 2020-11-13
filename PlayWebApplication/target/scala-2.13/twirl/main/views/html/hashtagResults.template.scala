
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

object hashtagResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Tweet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resultList: List[Tweet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <link rel="stylesheet" href='"""),_display_(/*4.35*/routes/*4.41*/.Assets.versioned("stylesheets/results.css")),format.raw/*4.85*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*5.35*/routes/*5.41*/.Assets.versioned("stylesheets/profile.css")),format.raw/*5.85*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*6.87*/("""'>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="body-container">
    <div class="body-container-content">
        <div class="results-container" >
            """),_display_(/*18.14*/for(i <- 0 until resultList.length) yield /*18.49*/ {_display_(Seq[Any](format.raw/*18.51*/("""
            """),format.raw/*19.13*/("""<div class="result-container">
                <div class="result-index">"""),_display_(/*20.44*/(i+1)),format.raw/*20.49*/("""</div>
                <div class="result">
                    <div class="result-title" onclick="showProfile('"""),_display_(/*22.70*/resultList(i)/*22.83*/.screenName),format.raw/*22.94*/("""')"> """),_display_(/*22.100*/('@'+resultList(i).screenName)),format.raw/*22.130*/("""</div>
                    <div class="result-content">
                        """),_display_(/*24.26*/resultList(i)/*24.39*/.content),format.raw/*24.47*/("""
                    """),format.raw/*25.21*/("""</div>
                    <div class="result-content">
                        """),_display_(/*27.26*/for(h <- resultList(i).hashTags) yield /*27.58*/ {_display_(Seq[Any](format.raw/*27.60*/("""
                        """),format.raw/*28.25*/("""<a href=""""),_display_(/*28.35*/routes/*28.41*/.HomeController.hashtag(h)),format.raw/*28.67*/("""">"""),_display_(/*28.70*/h),format.raw/*28.71*/("""</a>
                        """)))}),format.raw/*29.26*/("""
                    """),format.raw/*30.21*/("""</div>


                </div>
            </div>
            """)))}),format.raw/*35.14*/("""
        """),format.raw/*36.9*/("""</div>
    </div>
</div>



<script>

    function goTo(url)
    """),format.raw/*45.5*/("""{"""),format.raw/*45.6*/("""
      """),format.raw/*46.7*/("""location.replace(url);
    """),format.raw/*47.5*/("""}"""),format.raw/*47.6*/("""


    """),format.raw/*50.5*/("""function getprofile() """),format.raw/*50.27*/("""{"""),format.raw/*50.28*/("""

        """),format.raw/*52.9*/("""var profile = $("#searchInput").val()

        window.location.replace("profile/");
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""

    """),format.raw/*57.5*/("""function goBack() """),format.raw/*57.23*/("""{"""),format.raw/*57.24*/("""
        """),format.raw/*58.9*/("""window.location.replace("http://localhost:9000/");
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""

        """),format.raw/*61.9*/("""function search()"""),format.raw/*61.26*/("""{"""),format.raw/*61.27*/("""
  """),format.raw/*62.3*/("""var searchText = $("#searchInput").val()

  window.location.replace(searchText);
  """),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""




    """),format.raw/*70.5*/("""</script>

</body>
</html>"""))
      }
    }
  }

  def render(resultList:List[Tweet]): play.twirl.api.HtmlFormat.Appendable = apply(resultList)

  def f:((List[Tweet]) => play.twirl.api.HtmlFormat.Appendable) = (resultList) => apply(resultList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-13T18:53:20.195343800
                  SOURCE: D:/uni Projects/Git/New folder/SOEN6441-APP/PlayWebApplication/app/views/hashtagResults.scala.html
                  HASH: db03103327f70c4ca2d7850521b5005aa887eaff
                  MATRIX: 921->1|1041->26|1069->28|1145->78|1159->84|1223->128|1287->166|1301->172|1365->216|1429->254|1443->260|1509->306|2274->1044|2325->1079|2365->1081|2407->1095|2509->1170|2535->1175|2677->1290|2699->1303|2731->1314|2765->1320|2817->1350|2927->1433|2949->1446|2978->1454|3028->1476|3138->1559|3186->1591|3226->1593|3280->1619|3317->1629|3332->1635|3379->1661|3409->1664|3431->1665|3493->1696|3543->1718|3643->1787|3680->1797|3781->1871|3809->1872|3844->1880|3899->1908|3927->1909|3964->1919|4014->1941|4043->1942|4082->1954|4204->2049|4233->2050|4268->2058|4314->2076|4343->2077|4380->2087|4467->2147|4496->2148|4535->2160|4580->2177|4609->2178|4640->2182|4753->2268|4781->2269|4822->2283
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|49->18|49->18|49->18|50->19|51->20|51->20|53->22|53->22|53->22|53->22|53->22|55->24|55->24|55->24|56->25|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|66->35|67->36|76->45|76->45|77->46|78->47|78->47|81->50|81->50|81->50|83->52|86->55|86->55|88->57|88->57|88->57|89->58|90->59|90->59|92->61|92->61|92->61|93->62|96->65|96->65|101->70
                  -- GENERATED --
              */
          