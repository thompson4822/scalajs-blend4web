import com.lihaoyi.workbench.Plugin._

enablePlugins(ScalaJSPlugin)

workbenchSettings

name := "blend4web"

version := "1.0"

scalaVersion := "2.11.8"

bootSnippet := "com.blend4web.Example.main();"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)

/*
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.2",
  "org.querki" %%% "jquery-facade" % "1.0-RC3",
  "com.lihaoyi" %%% "scalatags" % "0.5.4"
)

bootSnippet := "com.mapquest.SpeedLimit().main(document.getElementById('parameters'), 'map');"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)


 */