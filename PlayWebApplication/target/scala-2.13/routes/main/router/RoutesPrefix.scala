// @GENERATOR:play-routes-compiler
// @SOURCE:S:/New folder (2)/Changed/PlayWebApplication/conf/routes
// @DATE:Sat Nov 28 09:53:46 EST 2020


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
