
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

object tweet extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Tweet],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resultList: List[Tweet]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <title>My search results</title>
  
    <link rel="stylesheet" href='"""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/results.css")),format.raw/*6.85*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("stylesheets/profile.css")),format.raw/*7.85*/("""'>
    <link rel="stylesheet" href='"""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*8.87*/("""'>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<div class="container">
    <div class="back-results-arrow-container">
        <div class="back-arrow-image" onclick="goBack()"><img src="../assets/images/arrow.svg"></div>
        <div class="back-arrow-text">Your search results</div>
    </div>
    <div class="search-container">
        <div class="search-input">
            <input type="text" placeholder="Search Here" id="search-terms">
        </div>
        <div class="search-image" onclick="search()"><img src="../assets/images/search.svg"></div>
    </div>
    <div class="body-container">
        <div class="body-container-content">
            <div class="search-result-stats">
                <div class="search-result-count-title">Search Results:&nbsp;</div>
                <div class="search-result-count">"""),_display_(/*32.51*/resultList/*32.61*/.size()),format.raw/*32.68*/("""</div>
                &nbsp;&nbsp;| &nbsp;&nbsp;
                <div class="search-result-count-title">Search Criteria &nbsp;</div>
                <div class="search-result-count search-text" id="search-text">searchText</div>
        
                &nbsp;&nbsp;| &nbsp;&nbsp;
                <div class="search-result-sentiment-title">Overall Sentiment:&nbsp;</div>
                <div class="search-result-sentiment">&#128512; Happy</div>
            </div>
        
            <div class="results-container" >
                """),_display_(/*43.18*/for(i <- 0 until resultList.length) yield /*43.53*/ {_display_(Seq[Any](format.raw/*43.55*/("""
                """),format.raw/*44.17*/("""<div class="result-container">
                    <div class="result-index">"""),_display_(/*45.48*/(i+1)),format.raw/*45.53*/("""</div>
                    <div class="result">
                        <div class="result-title" onclick="showProfile('"""),_display_(/*47.74*/resultList(i)/*47.87*/.screenName),format.raw/*47.98*/("""')"> """),_display_(/*47.104*/('@'+resultList(i).screenName)),format.raw/*47.134*/("""</div>
                        <div class="result-content">
                            """),_display_(/*49.30*/resultList(i)/*49.43*/.content),format.raw/*49.51*/("""
                       """),format.raw/*50.24*/("""</div>
                        <div class="result-content">
                        """),_display_(/*52.26*/for(h <- resultList(i).hashTags) yield /*52.58*/ {_display_(Seq[Any](format.raw/*52.60*/("""
                        """),format.raw/*53.25*/("""<a href=""""),_display_(/*53.35*/routes/*53.41*/.HomeController.hashtag(h)),format.raw/*53.67*/("""">"""),_display_(/*53.70*/h),format.raw/*53.71*/("""</a>
                        """)))}),format.raw/*54.26*/("""
                        """),format.raw/*55.25*/("""</div>


                    </div>
                </div>
                """)))}),format.raw/*60.18*/("""
            """),format.raw/*61.13*/("""</div>
        </div>
    </div>
</div>

<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog" id="modal-profile">
    </div>
</div>

<script>
    let input = document.getElementById('search-terms');
    $(document).ready(function()"""),format.raw/*73.33*/("""{"""),format.raw/*73.34*/("""
    """),format.raw/*74.5*/("""let keyWord = window.location.pathname.split("/").pop();
    if(typeof keyWord !== 'undefined')
    """),format.raw/*76.5*/("""{"""),format.raw/*76.6*/("""
      """),format.raw/*77.7*/("""$('#search-terms').val(keyWord);
      $('#search-text').text(keyWord);
    """),format.raw/*79.5*/("""}"""),format.raw/*79.6*/("""
    
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""");

  function showProfile(userName = '')
  """),format.raw/*84.3*/("""{"""),format.raw/*84.4*/("""
    """),format.raw/*85.5*/("""$.ajax("""),format.raw/*85.12*/("""{"""),format.raw/*85.13*/("""
            """),format.raw/*86.13*/("""url: '/profile/'+userName,
            type: "GET",
            success: function (data) """),format.raw/*88.38*/("""{"""),format.raw/*88.39*/("""
                """),format.raw/*89.17*/("""$('#modal-profile').html( $(data).find('.modal-content'));
                $('#myModal').modal('show');
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/("""
        """),format.raw/*92.9*/("""}"""),format.raw/*92.10*/(""");
  """),format.raw/*93.3*/("""}"""),format.raw/*93.4*/("""

  """),format.raw/*95.3*/("""function goBack() """),format.raw/*95.21*/("""{"""),format.raw/*95.22*/("""
        """),format.raw/*96.9*/("""window.location.replace("http://localhost:9000/");
        """),format.raw/*97.9*/("""}"""),format.raw/*97.10*/("""

  """),format.raw/*99.3*/("""function search()"""),format.raw/*99.20*/("""{"""),format.raw/*99.21*/("""
    """),format.raw/*100.5*/("""event.stopPropagation();
    event.preventDefault();

    if(input.value.trim() !== '')
    """),format.raw/*104.5*/("""{"""),format.raw/*104.6*/("""
        """),format.raw/*105.9*/("""$.ajax("""),format.raw/*105.16*/("""{"""),format.raw/*105.17*/("""
            """),format.raw/*106.13*/("""url: '/tweetSearch/'+input.value,
            type: "GET",
            success: function (data) """),format.raw/*108.38*/("""{"""),format.raw/*108.39*/("""
                """),format.raw/*109.17*/("""let result = $(data).find('.body-container-content');
                result.find('.search-text').html($('#search-terms').val());
                $('.body-container').prepend(result);
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/("""
        """),format.raw/*113.9*/("""}"""),format.raw/*113.10*/(""");
        
    """),format.raw/*115.5*/("""}"""),format.raw/*115.6*/("""
  """),format.raw/*116.3*/("""}"""),format.raw/*116.4*/("""
  """),format.raw/*117.3*/("""input.addEventListener("keyup", function(event) """),format.raw/*117.51*/("""{"""),format.raw/*117.52*/("""
  """),format.raw/*118.3*/("""if (event.keyCode === 13) """),format.raw/*118.29*/("""{"""),format.raw/*118.30*/("""
    """),format.raw/*119.5*/("""event.preventDefault();
    search();
  """),format.raw/*121.3*/("""}"""),format.raw/*121.4*/("""
"""),format.raw/*122.1*/("""}"""),format.raw/*122.2*/(""");
</script>
</body>
</html>
"""))
      }
    }
  }

  def render(resultList:List[Tweet]): play.twirl.api.HtmlFormat.Appendable = apply(resultList)

  def f:((List[Tweet]) => play.twirl.api.HtmlFormat.Appendable) = (resultList) => apply(resultList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-11-13T20:44:45.426126700
                  SOURCE: D:/uni Projects/Git/New folder/SOEN6441-APP/PlayWebApplication/app/views/tweet.scala.html
                  HASH: 2c0e497978caee9b351cbe9c9cd4a4061ede75ee
                  MATRIX: 912->1|1032->26|1060->28|1178->120|1192->126|1256->170|1320->208|1334->214|1398->258|1462->296|1476->302|1542->348|2970->1749|2989->1759|3017->1766|3591->2313|3642->2348|3682->2350|3728->2368|3834->2447|3860->2452|4010->2575|4032->2588|4064->2599|4098->2605|4150->2635|4268->2726|4290->2739|4319->2747|4372->2772|4486->2859|4534->2891|4574->2893|4628->2919|4665->2929|4680->2935|4727->2961|4757->2964|4779->2965|4841->2996|4895->3022|5007->3103|5049->3117|5349->3389|5378->3390|5411->3396|5540->3498|5568->3499|5603->3507|5708->3585|5736->3586|5775->3598|5803->3599|5877->3646|5905->3647|5938->3653|5973->3660|6002->3661|6044->3675|6163->3766|6192->3767|6238->3785|6384->3903|6413->3904|6450->3914|6479->3915|6512->3921|6540->3922|6573->3928|6619->3946|6648->3947|6685->3957|6772->4017|6801->4018|6834->4024|6879->4041|6908->4042|6942->4048|7066->4144|7095->4145|7133->4155|7169->4162|7199->4163|7242->4177|7369->4275|7399->4276|7446->4294|7674->4493|7704->4494|7742->4504|7772->4505|7818->4523|7847->4524|7879->4528|7908->4529|7940->4533|8017->4581|8047->4582|8079->4586|8134->4612|8164->4613|8198->4619|8268->4661|8297->4662|8327->4664|8356->4665
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|63->32|63->32|63->32|74->43|74->43|74->43|75->44|76->45|76->45|78->47|78->47|78->47|78->47|78->47|80->49|80->49|80->49|81->50|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|85->54|86->55|91->60|92->61|104->73|104->73|105->74|107->76|107->76|108->77|110->79|110->79|112->81|112->81|115->84|115->84|116->85|116->85|116->85|117->86|119->88|119->88|120->89|122->91|122->91|123->92|123->92|124->93|124->93|126->95|126->95|126->95|127->96|128->97|128->97|130->99|130->99|130->99|131->100|135->104|135->104|136->105|136->105|136->105|137->106|139->108|139->108|140->109|143->112|143->112|144->113|144->113|146->115|146->115|147->116|147->116|148->117|148->117|148->117|149->118|149->118|149->118|150->119|152->121|152->121|153->122|153->122
                  -- GENERATED --
              */
          