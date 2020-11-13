// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Negin/Documents/GitHub/SOEN6441-APP/PlayWebApplication/conf/routes
// @DATE:Fri Nov 13 23:44:22 IRST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function(user0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("user", user0))})
        }
      """
    )
  
    // @LINE:9
    def tweetSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tweetSearch",
      """
        function(keywords0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tweetSearch/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("keywords", keywords0))})
        }
      """
    )
  
    // @LINE:11
    def frequency: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.frequency",
      """
        function(keywords0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "frequency" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("keywords", keywords0)])})
        }
      """
    )
  
    // @LINE:10
    def hashtag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.hashtag",
      """
        function(keywords0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hashtag/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("keywords", keywords0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
