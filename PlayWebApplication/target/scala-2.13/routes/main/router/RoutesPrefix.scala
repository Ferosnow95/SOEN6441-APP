// @GENERATOR:play-routes-compiler
// @SOURCE:C:/PlayWebApplication/conf/routes
// @DATE:Tue Nov 10 22:01:36 EST 2020


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
