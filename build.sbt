name := "ourtatame"

version := "1.0"

lazy val `ourtatame` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaJpa,
  "org.apache.directory.api" % "api-all" % "1.0.0-M14",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "org.hibernate" % "hibernate-core" % "4.2.3.Final",
  "org.hibernate" % "hibernate-entitymanager" % "4.2.3.Final",
  "net.sf.opencsv" % "opencsv" % "2.3"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  