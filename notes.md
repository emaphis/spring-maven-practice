# Some notes

## Getting stared
mvn archetype:generate -DgroupId=com.mkyong -DartifactId=ExampleProgram -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

http://maven.apache.org/guides/getting-started/index.html
mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.mycompany.app -DartifactId=my-app

## Another simple project
https://books.sonatype.com/mvnex-book/reference/simple-project-sect-create-simple.html 

mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=simple -Dpackage=com.mycompany.app -Dversion=1.0-SNAPSHOT

### How to run
java -cp target\simple-1.0-SNAPSHOT.jar com.mycompany.app.App

## Multi-Module Projects
- Create parent projmvn arc



## To set up Java 9 for a maven project

```xml
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.7.0</version>
      <configuration>
        <source>9</source>
        <target>9</target>
      </configuration>
    </plugin>
```

## To set up UTF-8 on Windows
```xml
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
```

## Maven code execution plugin
```xml
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
```
