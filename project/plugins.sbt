addSbtPlugin("com.eed3si9n" % "sbt-projectmatrix" % "0.9.0")

val sbtSoftwareMillVersion = "2.0.8"
addSbtPlugin(
  "com.softwaremill.sbt-softwaremill" % "sbt-softwaremill-common" % sbtSoftwareMillVersion
)
addSbtPlugin(
  "com.softwaremill.sbt-softwaremill" % "sbt-softwaremill-publish" % sbtSoftwareMillVersion
)

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.7.1")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.0.1")
