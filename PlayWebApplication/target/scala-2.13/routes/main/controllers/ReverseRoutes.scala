// @GENERATOR:play-routes-compiler
// @SOURCE:D:/uni Projects/Git/New folder/SOEN6441-APP/PlayWebApplication/conf/routes
// @DATE:Fri Nov 13 20:21:42 IRST 2020

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
    def profile(user:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:9
    def tweetSearch(keywords:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tweetSearch/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("keywords", keywords)))
    }
  
    // @LINE:11
    def frequency(keywords:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frequency" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("keywords", keywords)))))
    }
  
    // @LINE:10
    def hashtag(keywords:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hashtag/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("keywords", keywords)))
    }
  
    // @LINE:6
    def index(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
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
