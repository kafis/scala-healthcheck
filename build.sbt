name := "scala-healthcheck"

version := "0.1.0-SNAPSHOT"

organization := "de.kafis"

scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-Xmax-classfile-name", "128",
  "-deprecation",
  "-unchecked",
  "-feature")

javacOptions ++= Seq(
  "-deprecation",
  "-Xlint:unchecked")

libraryDependencies ++= Seq()

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"    % "2.2.6"   ,
  "org.mockito"    %  "mockito-core" % "1.10.19" ,
  "org.scalacheck" %% "scalacheck"   % "1.12.5"
).map (_ % "test")
