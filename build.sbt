ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "demo"
  )




//libraryDependencies += "com.thesamet.scalapb" %% "protoc-gen" % "0.9.6"

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / ""
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
)

// Configure PB.targets to specify the package for case classes to be converted to Protocol Buffers
//PB.targets in Compile := Seq(
//  scalapb.gen(packageName = "com.example.models") -> (sourceManaged in Compile).value
//)

enablePlugins(scala2protobuf.Scala2ProtobufPlugin)