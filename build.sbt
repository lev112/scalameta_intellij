lazy val commonSettings = Seq(
  scalaVersion := "2.11.11",
  libraryDependencies ++= Seq(
    "org.scalameta" %% "scalameta" % "1.7.0"
  ),
  addCompilerPlugin("org.scalameta" %% "paradise" % "3.0.0-M10" cross CrossVersion.full)
)

lazy val scalameta_code = project.in(file("."))
  .settings(commonSettings: _*)

lazy val examples = project.in(file("examples"))
  .settings(commonSettings: _*)
  .dependsOn(scalameta_code)