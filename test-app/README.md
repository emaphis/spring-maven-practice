# A Java 11 App - ported to higher versions as they get published

# Start
> mvn archetype:generate -DgroupId=org.emaphis.app -DartifactId=test-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

 - directory structure - -DgroupId=org.emaphis.app
  test-app\src\main\java\org\emaphis\app\App.java
  ........\...\test\java\org\emaphis\app\AppTest.java
  package org.emaphis.app;

# Mods from start.
 - Change jUnit to 4.12
 - Add UTF-8 setting

 > mvn validate
 > mvn compile
 > mvn test
 > mvn package
 > mvn clean

 > java -cp target\test-app-1.0-SNAPSHOT.jar org.emaphis.app.App
