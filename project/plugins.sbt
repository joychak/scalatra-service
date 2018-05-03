
//resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
//resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
//resolvers += "Spray Repository" at "http://repo.spray.cc/"

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.3.13")
addSbtPlugin("org.scalatra.sbt" % "sbt-scalatra" % "1.0.2")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")