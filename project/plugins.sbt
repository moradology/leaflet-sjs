addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  //Resolver.bintrayRepo("azavea", "maven"),
  Classpaths.sbtPluginReleases,
  Opts.resolver.sonatypeReleases
)


