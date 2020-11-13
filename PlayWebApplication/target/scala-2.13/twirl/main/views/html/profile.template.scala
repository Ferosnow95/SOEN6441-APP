
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


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<html>
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
                  DATE: 2020-11-13T16:25:58.682328100
                  SOURCE: D:/uni Projects/Git/New folder/SOEN6441-APP/PlayWebApplication/app/views/profile.scala.html
                  HASH: 6b2d433d8c775e1902cc964b045bc0384ca95080
                  MATRIX: 910->1|1027->23|1055->25|1133->77|1147->83|1211->127|1275->165|1289->171|1353->215|2187->1022|2207->1033|2238->1043|2504->1282|2524->1293|2550->1298|2645->1366|2665->1377|2697->1388|2815->1479|2835->1490|2866->1500|3029->1636|3049->1647|3080->1657|3280->1830|3300->1841|3333->1853|3379->1871|3701->2166|3721->2177|3753->2188|4013->2421|4033->2432|4059->2437|4387->2738|4446->2781|4486->2783|4534->2803|4640->2882|4666->2887|4815->3009|4835->3020|4871->3035|4985->3122|5005->3133|5044->3151|5097->3176|5207->3255|5253->3273
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|51->20|51->20|51->20|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|61->30|61->30|61->30|65->34|65->34|65->34|66->35|70->39|70->39|70->39|73->42|73->42|73->42|81->50|81->50|81->50|82->51|83->52|83->52|85->54|85->54|85->54|87->56|87->56|87->56|88->57|91->60|92->61
                  -- GENERATED --
              */
          