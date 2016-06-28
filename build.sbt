name := "leaflet-sjs"

version := "0.1.0"

scalaVersion := "2.11.8"

organization := "Azavea"

bintrayPackageLabels := Seq("leaflet", "scalajs")

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

enablePlugins(ScalaJSPlugin)

parallelExecution in Test := false

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-Yinline-warnings",
  "-language:implicitConversions",
  "-language:reflectiveCalls",
  "-language:higherKinds",
  "-language:postfixOps",
  "-language:existentials",
  "-feature"
)

shellPrompt := { s => Project.extract(s).currentProject.id + " > " }

persistLauncher := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
  "com.lihaoyi" %%% "utest" % "0.4.3" % "test",
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)

jsDependencies ++= Seq(
  "org.webjars.bower" % "leaflet" % "1.0.0-rc.1"
    /         "leaflet.js"
    commonJSName "L")

