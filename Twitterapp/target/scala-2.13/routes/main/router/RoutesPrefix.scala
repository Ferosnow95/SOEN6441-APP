// @GENERATOR:play-routes-compiler
// @SOURCE:A:/New folder (3)/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Mon Nov 09 20:05:29 EST 2020


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
