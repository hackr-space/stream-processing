name := "stream-processing"

version := "0.1"

scalaVersion := "2.13.2"

lazy val beamVersion = "2.22.0"
lazy val slf4jVersion = "1.7.30"
lazy val kafkaVersion = "2.5.0"

libraryDependencies ++= Seq(
  "org.apache.beam" % "beam-runners-direct-java" % beamVersion,
  "org.apache.beam" % "beam-sdks-java-io-kafka" % beamVersion,
  "org.apache.kafka" %% "kafka" % kafkaVersion,
  "org.slf4j" % "slf4j-api" % slf4jVersion,
  "org.slf4j" % "slf4j-log4j12" % slf4jVersion,
)

resolvers += "confluent" at "http://packages.confluent.io/maven/"