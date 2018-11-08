name := """playtest411"""
organization := "nicholas"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

libraryDependencies += "org.postgresql" % "postgresql" % "9.4-1201-jdbc41"