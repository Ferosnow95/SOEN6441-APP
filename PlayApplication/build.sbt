name := """play-application"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).enablePlugins(LauncherJarPlugin)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.7"
libraryDependencies += "org.twitter4j" % "twitter4j-async" % "4.0.7"
libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "4.0.7"
libraryDependencies += "org.twitter4j" % "twitter4j-media-support" % "4.0.6"
libraryDependencies += "org.mockito" % "mockito-core" % "3.6.0" % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.4"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.4"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.5" % Test
libraryDependencies += "com.typesafe.akka" %% "akka-http-jackson" % "10.1.12"
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.12"


