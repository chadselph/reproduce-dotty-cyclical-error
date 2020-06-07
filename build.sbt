scalaVersion := "0.25.0-bin-20200606-31879e5-NIGHTLY"


lazy val root = (project in file("."))
  .settings(
    libraryDependencies += "software.amazon.awssdk" % "cloudwatchlogs" % "2.13.28"
)
