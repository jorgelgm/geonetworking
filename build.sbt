name              := "geonetworking"

version           := "0.1.0-SNAPSHOT"

organization      := "net.gcdc"

mainClass         := Some("net.gcdc.geonetworking.GnBtpRunner")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalacOptions += "-target:jvm-1.7"

libraryDependencies += "org.threeten" % "threetenbp" % "1.2"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

libraryDependencies += "junit" % "junit" % "4.12" % Test

libraryDependencies += "org.hamcrest" % "hamcrest-all" % "1.3" % Test

libraryDependencies += "org.hamcrest" % "hamcrest-core" % "1.3" % Test

libraryDependencies += "org.hamcrest" % "hamcrest-library" % "1.3" % Test

libraryDependencies += "org.hamcrest" % "hamcrest-integration" % "1.3" % Test