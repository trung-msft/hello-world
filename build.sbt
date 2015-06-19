sampleKeyC in ThisBuild := "C: in build.sbt to ThisBuild"

sampleKeyD := "D: in build.sbt"

// Read here for optional jars and dependencies
libraryDependencies ++= Seq(
	"org.specs2" %% "specs2" % "2.3.11" % "test",
	"org.mockito" % "mockito-all" % "1.9.5" % "test"
)

// Don't add the following resolver
// resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")
