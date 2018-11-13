// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nicholas/Google Drive/PSU/Semester 7/IST 411/playtest411/conf/routes
// @DATE:Sun Nov 11 17:26:54 EST 2018

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

  
    // @LINE:11
    def deletePlayer(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteplayer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def getPlayers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "players")
    }
  
    // @LINE:8
    def addPlayer(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "player")
    }
  
    // @LINE:13
    def editPlayer(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "editplayer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:9
    def getPlayer(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "player/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
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

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
