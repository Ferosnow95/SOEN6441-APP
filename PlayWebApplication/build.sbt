name := """play-java-hello-world-tutorial"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.7"
libraryDependencies += "org.mockito" % "mockito-core" % "3.6.0" % "test"
libraryDependencies +="org.awaitility" % "awaitility" % "4.0.1" % "test"
libraryDependencies +="org.assertj" % "assertj-core" % "3.14.0" % "test"

