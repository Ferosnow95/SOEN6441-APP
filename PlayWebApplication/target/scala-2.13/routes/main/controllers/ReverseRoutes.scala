// @GENERATOR:play-routes-compiler
// @SOURCE:C:/PlayWebApplication/conf/routes
// @DATE:Tue Nov 10 22:01:36 EST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def results(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "results")
    }
  
    // @LINE:10
    def tweetSearch(keywords:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweetSearch/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("keywords", keywords)))
    }
  
    // @LINE:6
    def index(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:9
    def profiles(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profiles")
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
