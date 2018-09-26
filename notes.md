# Some notes

## Getting stared
mvn archetype:generate -DgroupId=com.mkyong -DartifactId=ExampleProgram -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

http://maven.apache.org/guides/getting-started/index.html
mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeVersion=1.3

## Another simple project
https://books.sonatype.com/mvnex-book/reference/simple-project-sect-create-simple.html 

mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=simple -Dpackage=com.mycompany.app -Dversion=1.0-SNAPSHOT

### How to run
java -cp target\simple-1.0-SNAPSHOT.jar com.mycompany.app.App

## Multi-Module Projects
- Create parent projmvn arc


## To set up Java 11 for a maven project
https://stackoverflow.com/questions/49398894/unable-to-compile-simple-java-10-project-with-maven/51586202#51586202
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.0</version>
    <configuration>
        <release>11</release>   <!-- or <release>10</release>-->
    </configuration>
</plugin>


## To set up UTF-8 on Windows
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

## Maven code execution plugin
<build>
  <plugins>

    <plugin>
      <groupId>org.codehaus.mojo</groupId>
        <artifactId>exec-maven-plugin</artifactId>
        <version>1.6.0</version>
        <configuration>
          <mainClass>com.mycompany.app.App</mainClass>
        </configuration>
      </plugin>

  </plugins>
</build>

