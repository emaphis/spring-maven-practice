Multi-module web app created with mavan


Parent:
mvn archetype:generate -DgroupId=com.leroydev.app -DartifactId=app-parent -Dversion=1.0.0-SNAPSHOT -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=pom-root

Webapp:
mvn archetype:generate -DgroupId=com.leroydev.app -DartifactId=app-web -Dversion=1.0.0-SNAPSHOT -Dpackage=war -DarchetypeArtifactId=maven-archetype-webapp

Service:
mvn archetype:generate -DgroupId=com.leroydev.app -DartifactId=app-service -Dversion=1.0.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Repository
mvn archetype:generate -DgroupId=com.leroydev.app -DartifactId=app-repository -Dversion=1.0.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
