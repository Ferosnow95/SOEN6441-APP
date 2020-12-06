name := """play-java-hello-world-tutorial"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).enablePlugins(LauncherJarPlugin)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.7"
libraryDependencies += "org.mockito" % "mockito-core" % "3.6.0" % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.4"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.4" % Test
//libraryDependencies += "com.typesafe.akka" %% "akka-http-jackson" % "10.1.8"
//libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.8"
libraryDependencies += "org.java-websocket" % "Java-WebSocket" % "1.3.0"
libraryDependencies += "com.typesafe.play" %% "play-specs2" % "2.8.5" % Test


