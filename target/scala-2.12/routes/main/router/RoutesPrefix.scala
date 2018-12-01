// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/super/Google Drive/PSU/Semester 7/IST 411/sportapp411/conf/routes
// @DATE:Sat Dec 01 18:12:16 EST 2018


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
