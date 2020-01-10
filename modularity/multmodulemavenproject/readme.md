# Another go at a mutiple module project

from here: <https://www.baeldung.com/maven-multi-module-project-java-jpms>.

# To setup the project:

mvn archetype:generate -DgroupId=com.leroydev.multimodulemavenproject -DartifactId=multimodulemavenproject

change packaging to 'pom' :  <package>pom</package>

# Create modules.

cd multimodulemavenproject

mvn archetype:generate -DgroupId=com.leroydev.entity  -DartifactId=entitymodule

mvn archetype:generate -DgroupId=com.leroydev.dao  -DartifactId=daomodule

mvn archetype:generate -DgroupId=com.leroydev.userdao  -DartifactId=userdaomodule

# Create a main project:

mvn archetype:generate -DgroupId=com.leroydev.mainapp  -DartifactId=mainappmodule
