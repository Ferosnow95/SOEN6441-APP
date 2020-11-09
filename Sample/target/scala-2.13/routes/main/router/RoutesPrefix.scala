// @GENERATOR:play-routes-compiler
// @SOURCE:C:/AM PC/AM/Concordia/Courses/0-soen-6441-app/playframework/play-samples-play-java-hello-world-tutorial/conf/routes
// @DATE:Sun Nov 08 17:26:23 EST 2020


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
