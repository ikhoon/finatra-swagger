name := "finatra-swagger"

organization := "com.github.ikhoon"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.11", "2.12.4")

releaseCrossBuild := true
//sbtVersion := "0.13.16"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % "17.12.0",
  "io.swagger" % "swagger-core" % "1.5.16",
  "io.swagger" %% "swagger-scala-module" % "1.0.4",
  "org.webjars" % "swagger-ui" % "3.2.0",
  "net.bytebuddy" % "byte-buddy" % "1.7.5",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-language:existentials",
  "-language:implicitConversions"
)

pomIncludeRepository := { _ => false }

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

// License of your choice
licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
homepage := Some(url("https://github.com/ikhoon/finatra-swagger"))
scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/ikhoon/finatra-swagger"),
    connection = "https://github.com/ikhoon/finatra-swagger.git"
  )
)
developers := List(
  Developer(id="ikhoon", name="Ikhoon Eom", email="ih.pert@gmail.com", url=url("https://github.com/ikhoon")),
  Developer(id="jakehschwartz", name="Jake Schwartz", email="jakehschwartz@gmail.com", url=url("https://www.jakehschwartz.com")),
  Developer(id="xiaodongw", name="Xiaodong Wang", email="xiaodongw79@gmail.com", url=url("https://github.com/xiaodongw"))
)
