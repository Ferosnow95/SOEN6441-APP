
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>
  <link rel="stylesheet" href='"""),_display_(/*3.33*/routes/*3.39*/.Assets.versioned("stylesheets/results.css")),format.raw/*3.83*/("""'>
  <link rel="stylesheet" href='"""),_display_(/*4.33*/routes/*4.39*/.Assets.versioned("stylesheets/profile.css")),format.raw/*4.83*/("""'>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<div id="myModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
          <div class="top-line"></div>
            <div class="modal-header">
              <div class="profile-picture">
                <img src="assets/profile-picture.jpg">
              </div>
              <div class="profile-info">
                <div class="profile-info-header">
                  <div class="profile-info-header-title">
                      <div class="profile-info-header-name">Tweeter Name</div>
                      <div class="profile-info-header-tag">Tweeter Handle</div>
                  </div>
                  <div class="profile-number-following">97</div>
                  <div class="profile-text-following">Following</div>
                  <div class="profile-number-followers">1.1M</div>
                  <div class="profile-text-followers">Followers</div>
                </div>
                <div class="profile-description">
                  The Profile Description Goes here Franklin took it upon himself to create a bio that not only asks his followers to test out their imaginations, but one which will also withstand the test of time. I mean, no matter what Nelson Franklin becomes in life, “Noun/noun/noun” is likely to be pretty accurate.
                </div>
                <div class="profile-info-footer">
                  <div class="profile-info-footer-image"><img src="assets/joined.svg"></div>
                  <div class="profile-info-footer-text">Joined</div>
                  <div class="profile-info-footer-date-joined">September 2012</div>
                  <div class="profile-info-footer-image"><img src="assets/link.svg"></div>
                  <div class="profile-info-footer-text">Link</div>
                  <div class="profile-info-footer-link">Linksgohere.ca</div>
                </div>
              </div>
              <div class="close-profile">
                <button type="button" class="close" onclick="goTo('results.html')" >
                  <img src="assets/close.svg"></button>
              </div>
            </div>
            <div class="modal-body">
              <div class="profile-body">
                <div class="profile-body-title">Latest Tweets</div>
                <div class="results-container" ></option>
                  <div class="result-container">
                    <div class="result-index">1</div>
                    <div class="result">
                       <div class="result-title" onclick="showmodal()">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">2</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">3</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">4</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">5</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">6</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">7</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">8</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">9</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                  <div class="result-container">
                    <div class="result-index">10</div>
                    <div class="result">
                       <div class="result-title">Tweeter Handle:</div>
                       <div class="result-content">
                         Process the results using the Java 8+ Streams API to add hyperlinks to user names, locations (if available), and hashtags (used in the individual parts detailed below).Note: for this assignment, you do not need to stream updates to the user interface. In other words, thefront-end page is static until a “refresh” (or new search) is triggered.
                       </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
        </div>
    </div>
</div>
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
                  DATE: 2020-11-10T22:06:47.543784600
                  SOURCE: C:/PlayWebApplication/app/views/profile.scala.html
                  HASH: d7b622cf91c6680ebcce689efe680bafd76790b0
                  MATRIX: 902->1|998->4|1063->43|1077->49|1141->93|1202->128|1216->134|1280->178
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4
                  -- GENERATED --
              */
          