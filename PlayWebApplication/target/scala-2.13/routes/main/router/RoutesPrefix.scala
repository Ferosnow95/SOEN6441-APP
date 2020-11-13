// @GENERATOR:play-routes-compiler
// @SOURCE:D:/uni Projects/Git/New folder/SOEN6441-APP/PlayWebApplication/conf/routes
// @DATE:Fri Nov 13 20:21:42 IRST 2020


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
