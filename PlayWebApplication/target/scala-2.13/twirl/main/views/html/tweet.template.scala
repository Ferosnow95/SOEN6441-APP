
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


Seq[Any](format.raw/*2.1*/("""<html>
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
                  DATE: 2020-11-13T09:52:03.438832100
                  SOURCE: C:/PlayWebApplication/app/views/tweet.scala.html
                  HASH: be90c80a9048b002dec304c7327fcf89b8c305c9
                  MATRIX: 912->1|1031->27|1145->115|1159->121|1223->165|1286->202|1300->208|1364->252|1427->289|1441->295|1507->341|2911->1718|2930->1728|2958->1735|3521->2271|3572->2306|3612->2308|3657->2325|3762->2403|3788->2408|3936->2529|3958->2542|3990->2553|4024->2559|4076->2589|4192->2678|4214->2691|4243->2699|4295->2723|4400->2797|4441->2810|4729->3070|4758->3071|4790->3076|4917->3176|4945->3177|4979->3184|5082->3260|5110->3261|5147->3271|5175->3272|5246->3316|5274->3317|5306->3322|5341->3329|5370->3330|5411->3343|5528->3432|5557->3433|5602->3450|5746->3566|5775->3567|5811->3576|5840->3577|5872->3582|5900->3583|5931->3587|5977->3605|6006->3606|6042->3615|6128->3674|6157->3675|6188->3679|6233->3696|6262->3697|6294->3702|6413->3794|6441->3795|6477->3804|6512->3811|6541->3812|6582->3825|6707->3921|6737->3922|6783->3939|7008->4135|7038->4136|7075->4145|7105->4146|7149->4162|7178->4163|7209->4166|7238->4167|7269->4170|7346->4218|7376->4219|7407->4222|7462->4248|7492->4249|7525->4254|7593->4294|7622->4295|7651->4296|7680->4297
                  LINES: 27->1|32->2|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|62->32|62->32|62->32|73->43|73->43|73->43|74->44|75->45|75->45|77->47|77->47|77->47|77->47|77->47|79->49|79->49|79->49|80->50|83->53|84->54|96->66|96->66|97->67|99->69|99->69|100->70|102->72|102->72|104->74|104->74|107->77|107->77|108->78|108->78|108->78|109->79|111->81|111->81|112->82|114->84|114->84|115->85|115->85|116->86|116->86|118->88|118->88|118->88|119->89|120->90|120->90|122->92|122->92|122->92|123->93|127->97|127->97|128->98|128->98|128->98|129->99|131->101|131->101|132->102|135->105|135->105|136->106|136->106|138->108|138->108|139->109|139->109|140->110|140->110|140->110|141->111|141->111|141->111|142->112|144->114|144->114|145->115|145->115
                  -- GENERATED --
              */
          