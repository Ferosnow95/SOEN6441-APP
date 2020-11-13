
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
                    </div>
                </div>
                """)))}),format.raw/*53.18*/("""
            """),format.raw/*54.13*/("""</div>
        </div>
    </div>
</div>

<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog" id="modal-profile">
    </div>
</div>

<script>
    let input = document.getElementById('search-terms');
    $(document).ready(function()"""),format.raw/*66.33*/("""{"""),format.raw/*66.34*/("""
    """),format.raw/*67.5*/("""let keyWord = window.location.pathname.split("/").pop();
    if(typeof keyWord !== 'undefined')
    """),format.raw/*69.5*/("""{"""),format.raw/*69.6*/("""
      """),format.raw/*70.7*/("""$('#search-terms').val(keyWord);
      $('#search-text').text(keyWord);
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""
    
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/(""");

  function showProfile(userName = '')
  """),format.raw/*77.3*/("""{"""),format.raw/*77.4*/("""
    """),format.raw/*78.5*/("""$.ajax("""),format.raw/*78.12*/("""{"""),format.raw/*78.13*/("""
            """),format.raw/*79.13*/("""url: '/profile/'+userName,
            type: "GET",
            success: function (data) """),format.raw/*81.38*/("""{"""),format.raw/*81.39*/("""
                """),format.raw/*82.17*/("""$('#modal-profile').html( $(data).find('.modal-content'));
                $('#myModal').modal('show');
            """),format.raw/*84.13*/("""}"""),format.raw/*84.14*/("""
        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/(""");
  """),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""

  """),format.raw/*88.3*/("""function goBack() """),format.raw/*88.21*/("""{"""),format.raw/*88.22*/("""
        """),format.raw/*89.9*/("""window.location.replace("http://localhost:9000/");
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""

  """),format.raw/*92.3*/("""function search()"""),format.raw/*92.20*/("""{"""),format.raw/*92.21*/("""
    """),format.raw/*93.5*/("""event.stopPropagation();
    event.preventDefault();

    if(input.value.trim() !== '')
    """),format.raw/*97.5*/("""{"""),format.raw/*97.6*/("""
        """),format.raw/*98.9*/("""$.ajax("""),format.raw/*98.16*/("""{"""),format.raw/*98.17*/("""
            """),format.raw/*99.13*/("""url: '/tweetSearch/'+input.value,
            type: "GET",
            success: function (data) """),format.raw/*101.38*/("""{"""),format.raw/*101.39*/("""
                """),format.raw/*102.17*/("""let result = $(data).find('.body-container-content');
                result.find('.search-text').html($('#search-terms').val());
                $('.body-container').prepend(result);
            """),format.raw/*105.13*/("""}"""),format.raw/*105.14*/("""
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/(""");
        
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/("""
  """),format.raw/*109.3*/("""}"""),format.raw/*109.4*/("""
  """),format.raw/*110.3*/("""input.addEventListener("keyup", function(event) """),format.raw/*110.51*/("""{"""),format.raw/*110.52*/("""
  """),format.raw/*111.3*/("""if (event.keyCode === 13) """),format.raw/*111.29*/("""{"""),format.raw/*111.30*/("""
    """),format.raw/*112.5*/("""event.preventDefault();
    search();
  """),format.raw/*114.3*/("""}"""),format.raw/*114.4*/("""
"""),format.raw/*115.1*/("""}"""),format.raw/*115.2*/(""");
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
                  DATE: 2020-11-12T21:05:24.520728500
                  SOURCE: C:/PlayWebApplication/app/views/tweet.scala.html
                  HASH: 60e5329812d45086e39b71b7bf17fec5a89f2c97
                  MATRIX: 912->1|1032->26|1060->28|1178->120|1192->126|1256->170|1320->208|1334->214|1398->258|1462->296|1476->302|1542->348|2970->1749|2989->1759|3017->1766|3591->2313|3642->2348|3682->2350|3728->2368|3834->2447|3860->2452|4010->2575|4032->2588|4064->2599|4098->2605|4150->2635|4268->2726|4290->2739|4319->2747|4372->2772|4480->2849|4522->2863|4822->3135|4851->3136|4884->3142|5013->3244|5041->3245|5076->3253|5181->3331|5209->3332|5248->3344|5276->3345|5350->3392|5378->3393|5411->3399|5446->3406|5475->3407|5517->3421|5636->3512|5665->3513|5711->3531|5857->3649|5886->3650|5923->3660|5952->3661|5985->3667|6013->3668|6046->3674|6092->3692|6121->3693|6158->3703|6245->3763|6274->3764|6307->3770|6352->3787|6381->3788|6414->3794|6537->3890|6565->3891|6602->3901|6637->3908|6666->3909|6708->3923|6835->4021|6865->4022|6912->4040|7140->4239|7170->4240|7208->4250|7238->4251|7284->4269|7313->4270|7345->4274|7374->4275|7406->4279|7483->4327|7513->4328|7545->4332|7600->4358|7630->4359|7664->4365|7734->4407|7763->4408|7793->4410|7822->4411
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|63->32|63->32|63->32|74->43|74->43|74->43|75->44|76->45|76->45|78->47|78->47|78->47|78->47|78->47|80->49|80->49|80->49|81->50|84->53|85->54|97->66|97->66|98->67|100->69|100->69|101->70|103->72|103->72|105->74|105->74|108->77|108->77|109->78|109->78|109->78|110->79|112->81|112->81|113->82|115->84|115->84|116->85|116->85|117->86|117->86|119->88|119->88|119->88|120->89|121->90|121->90|123->92|123->92|123->92|124->93|128->97|128->97|129->98|129->98|129->98|130->99|132->101|132->101|133->102|136->105|136->105|137->106|137->106|139->108|139->108|140->109|140->109|141->110|141->110|141->110|142->111|142->111|142->111|143->112|145->114|145->114|146->115|146->115
                  -- GENERATED --
              */
          