lazy val root = (project in file("."))
  .enablePlugins(
    CucumberPlugin
  )
  .settings(
    name := "cucumber-scala",
    version := "0.1",
    scalaVersion := "2.12.5",

    CucumberPlugin.glue := "steps",

    libraryDependencies ++= Seq(
      "mysql"                      % "mysql-connector-java"   % "5.1.46",
      "com.typesafe.slick"        %% "slick"                  % "3.2.3",
      "com.typesafe.slick"        %% "slick-hikaricp"         % "3.2.3",

      "org.mockito"                % "mockito-core"           % "2.17.0"  % "test",
      "org.scalatest"             %% "scalatest"              % "3.0.5"   % "test",
      "io.cucumber"                % "cucumber-core"          % "4.2.6"   % "test",
      "io.cucumber"               %% "cucumber-scala"         % "4.2.6"   % "test",
      "io.cucumber"                % "cucumber-jvm"           % "4.2.6"   % "test",
      "io.cucumber"                % "cucumber-junit"         % "4.2.6"   % "test",
      "com.codeborne"              % "selenide"               % "5.2.2"   % "test",
      "org.slf4j"                  % "slf4j-nop"              % "1.7.26"  % "test"
    )
  )
