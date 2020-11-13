
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Profile,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userProfile: Profile):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
  <head>
    <link rel="stylesheet" href='"""),_display_(/*4.35*/routes/*4.41*/.Assets.versioned("stylesheets/results.css")),format.raw/*4.85*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*5.35*/routes/*5.41*/.Assets.versioned("stylesheets/profile.css")),format.raw/*5.85*/("""'>
  
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </head>
<body>
  <div id="myModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
          <div class="top-line"></div>
            <div class="modal-header">
              <div class="profile-picture">
                <img src=""""),_display_(/*20.28*/userProfile/*20.39*/.imageLink),format.raw/*20.49*/("""">
              </div>
              <div class="profile-info">
                <div class="profile-info-header">
                  <div class="profile-info-header-title">
                      <div class="profile-info-header-name">"""),_display_(/*25.62*/userProfile/*25.73*/.name),format.raw/*25.78*/("""</div>
                      <div class="profile-info-header-tag">"""),_display_(/*26.61*/userProfile/*26.72*/.screenName),format.raw/*26.83*/("""</div>
                  </div>
                  <div class="profile-number-following">"""),_display_(/*28.58*/userProfile/*28.69*/.following),format.raw/*28.79*/("""</div>
                  <div class="profile-text-following">Following</div>
                  <div class="profile-number-followers">"""),_display_(/*30.58*/userProfile/*30.69*/.followers),format.raw/*30.79*/("""</div>
                  <div class="profile-text-followers">Followers</div>
                </div>
                <div class="profile-description">
                  """),_display_(/*34.20*/userProfile/*34.31*/.description),format.raw/*34.43*/("""
                """),format.raw/*35.17*/("""</div>
                <div class="profile-info-footer">
                  <div class="profile-info-footer-image"><img src="/assets/images/joined.svg"></div>
                  <div class="profile-info-footer-text">Joined</div>
                  <div class="profile-info-footer-date-joined">"""),_display_(/*39.65*/userProfile/*39.76*/.dateJoined),format.raw/*39.87*/("""</div>
                  <div class="profile-info-footer-image"><img src="/assets/images/link.svg"></div>
                  <div class="profile-info-footer-text">Link</div>
                  <div class="profile-info-footer-link">"""),_display_(/*42.58*/userProfile/*42.69*/.link),format.raw/*42.74*/("""</div>
                </div>
              </div>
            </div>
            <div class="modal-body">
              <div class="profile-body">
                <div class="profile-body-title">Latest Tweets</div>
                <div class="results-container" ></option>
                  """),_display_(/*50.20*/for(i <- 0 until userProfile.tweets.length) yield /*50.63*/ {_display_(Seq[Any](format.raw/*50.65*/("""
                  """),format.raw/*51.19*/("""<div class="result-container">
                    <div class="result-index">"""),_display_(/*52.48*/(i+1)),format.raw/*52.53*/("""</div>
                    <div class="result">
                       <div class="result-title" onclick="showmodal()">"""),_display_(/*54.73*/userProfile/*54.84*/.tweets(i).date),format.raw/*54.99*/("""</div>
                       <div class="result-content">
                         """),_display_(/*56.27*/userProfile/*56.38*/.tweets(i).content),format.raw/*56.56*/("""
                       """),format.raw/*57.24*/("""</div>
                    </div>
                  </div>
                """)))}),format.raw/*60.18*/("""
                """),format.raw/*61.17*/("""</div>
              </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>"""))
      }
    }
  }

  def render(userProfile:Profile): play.twirl.api.HtmlFormat.Appendable = apply(userProfile)

  def f:((Profile) => play.twirl.api.HtmlFormat.Appendable) = (userProfile) => apply(userProfile)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-12T21:25:58.747752
                  SOURCE: C:/PlayWebApplication/app/views/profile.scala.html
                  HASH: 9fbfb257959c4c196c2f8f99f0e599f8a81f91de
                  MATRIX: 910->1|1026->24|1102->74|1116->80|1180->124|1243->161|1257->167|1321->211|2140->1003|2160->1014|2191->1024|2452->1258|2472->1269|2498->1274|2592->1341|2612->1352|2644->1363|2760->1452|2780->1463|2811->1473|2972->1607|2992->1618|3023->1628|3219->1797|3239->1808|3272->1820|3317->1837|3635->2128|3655->2139|3687->2150|3944->2380|3964->2391|3990->2396|4310->2689|4369->2732|4409->2734|4456->2753|4561->2831|4587->2836|4734->2956|4754->2967|4790->2982|4902->3067|4922->3078|4961->3096|5013->3120|5120->3196|5165->3213
                  LINES: 27->1|32->2|34->4|34->4|34->4|35->5|35->5|35->5|50->20|50->20|50->20|55->25|55->25|55->25|56->26|56->26|56->26|58->28|58->28|58->28|60->30|60->30|60->30|64->34|64->34|64->34|65->35|69->39|69->39|69->39|72->42|72->42|72->42|80->50|80->50|80->50|81->51|82->52|82->52|84->54|84->54|84->54|86->56|86->56|86->56|87->57|90->60|91->61
                  -- GENERATED --
              */
          