name := "scala-fp"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions in Global += "-language:experimental.macros"

scalastyleSources in Compile := (unmanagedSourceDirectories in Compile).value

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

libraryDependencies += "org.mockito" % "mockito-core" % "1.10.19" % "test"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value