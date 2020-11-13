// @GENERATOR:play-routes-compiler
// @SOURCE:C:/New folder (3)/PlayWebApplication/conf/routes
// @DATE:Fri Nov 13 16:36:02 EST 2020


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
