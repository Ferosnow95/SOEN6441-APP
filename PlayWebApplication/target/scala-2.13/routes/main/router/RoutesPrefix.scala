// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Negin/Documents/GitHub/SOEN6441-APP/PlayWebApplication/conf/routes
// @DATE:Fri Nov 13 23:44:22 IRST 2020


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
