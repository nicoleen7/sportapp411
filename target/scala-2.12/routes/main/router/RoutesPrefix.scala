// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/nicholas/Google Drive/PSU/Semester 7/IST 411/playtest411/conf/routes
// @DATE:Fri Nov 09 15:24:04 EST 2018


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