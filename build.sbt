name := "zzti_soft"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.7"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.38"

libraryDependencies += "com.typesafe.slick" %% "slick" % "3.1.1"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.6"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"

libraryDependencies +="net.sourceforge.jexcelapi" % "jxl" % "2.6.12"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.0"

libraryDependencies += "org.apache.hbase" % "hbase-client" % "1.1.2"

libraryDependencies += "org.apache.hbase" % "hbase-common" % "1.1.2"

libraryDependencies += "org.apache.hbase" % "hbase-server" % "1.1.2"
