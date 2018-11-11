// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nicholas/Google Drive/PSU/Semester 7/IST 411/playtest411/conf/routes
// @DATE:Sun Nov 11 17:26:54 EST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
