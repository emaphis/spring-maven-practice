# Another Java 8 Modules example

https://dzone.com/articles/java-9-modules-introduction-part-1

- directory structure
mods
src
|_ com.mydeveloperplanet.jpmshello - module-info.java
|   |_ com
|       |_mydeveloperplanet
|          |_ jpmshello - HelloModules.java
target

## Compiling simple app

javac -d mods/com.mydeveloperplanet.jpmshello src/com.mydeveloperplanet.jpmshello/module-info.java src/com.mydeveloperplanet.jpmshello/com/mydeveloperplanet/jpmshello/HelloModules.java

## Execution of simple app

java --module-path mods --module com.mydeveloperplanet.jpmshello/com.mydeveloperplanet.jpmshello.HelloModules

## Creating a jar file for simple app

jar --create --file target/jpms-hello-modules.jar --main-class com.mydeveloperplanet.jpmshello.HelloModules -C mods/com.mydeveloperplanet.jpmshello .

## Executing a jar file for simple app

java --module-path target/jpms-hello-modules.jar --module com.mydeveloperplanet.jpmshello/com.mydeveloperplanet.jpmshello.HelloModules

## Describe module

java --module-path target/jpms-hello-modules.jar --describe-module com.mydeveloperplanet.jpmshello

## Multi-module example

- directory structure
mods
src
|_ com.mydeveloperplanet.jpmshello - module-info.java
|   |_ com
|       |_mydeveloperplanet
|          |_ jpmshello - HelloModules.java
|_ com.mydeveloperplanet.jpmshi - module-info.java
    |_ com
        |_ mydeveloperplanet
            |_ jpmshi - HiModules.java
target

## Compile a Multi-Module Project

We compile the multi-module project. Compared to the single module project, we change the compilation command as follows:

- The modules output path (-d option) is changed to mods

- We add the module-source-path option in order to specify where the modules source path is

- We add the sources of module com.mydeveloperplanet.jpmshi to the list of the be compiled classes

javac -d mods --module-source-path src src/com.mydeveloperplanet.jpmshello/module-info.java src/com.mydeveloperplanet.jpmshello/com/mydeveloperplanet/jpmshello/HelloModules.java src/com.mydeveloperplanet.jpmshi/module-info.java src/com.mydeveloperplanet.jpmshi/com/mydeveloperplanet/jpmshi/HiModules.java

## Create jar file for module com.mydeveloperplanet.jpmshi:

jar --create --file target/jpms-hi-modules.jar -C mods/com.mydeveloperplanet.jpmshi .

## Create the JAR file for the module com.mydeveloperplanet.jpmshello

jar --create --file target/jpms-hello-modules.jar --main-class com.mydeveloperplanet.jpmshello.HelloModules -C mods/com.mydeveloperplanet.jpmshello .

## Execute the multi-module project

java --module-path target --module com.mydeveloperplanet.jpmshello/com.mydeveloperplanet.jpmshello.HelloModules
