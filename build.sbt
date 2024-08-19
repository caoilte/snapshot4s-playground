import Dependencies._
import snapshot4s.BuildInfo.snapshot4sVersion

ThisBuild / scalaVersion     := "3.4.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "snapshot4s playground",
    libraryDependencies += munit % Test
  ).enablePlugins(Snapshot4sPlugin)


libraryDependencies += "com.siriusxm" %% "snapshot4s-munit" % snapshot4sVersion % Test

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
