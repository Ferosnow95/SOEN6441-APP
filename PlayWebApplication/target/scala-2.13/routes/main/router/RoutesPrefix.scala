// @GENERATOR:play-routes-compiler
// @SOURCE:D:/uni Projects/PlayWebApplication/conf/routes
// @DATE:Mon Nov 09 22:51:02 IRST 2020


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
