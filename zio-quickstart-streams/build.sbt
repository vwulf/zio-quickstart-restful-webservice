scalaVersion := "2.13.8"
organization := "dev.zio"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"         % "2.0.15",
  "dev.zio" %% "zio-test"    % "2.0.15" % Test,
  "dev.zio" %% "zio-streams" % "2.0.15"
)
