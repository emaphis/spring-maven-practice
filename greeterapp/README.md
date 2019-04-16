# Greeter App

- example of a modular app. Oracle Example

http://openjdk.java.net/projects/jigsaw/quick-start

Example commands stored and cmd files.

## compile

javac -d mods/org.astro src/org.astro/module-info.java src/org.astro/org/astro/World.java

javac --module-path mods -d mods/com.greetings src/com.greetings/module-info.java src/com.greetings/com/greetings/Main.java

## run

java --module-path mods -m com.greetings/com.greetings.Main

## package

jar --create --file=mlib/org.astro@1.0.jar --module-version=1.0 -C mods/org.astro .

jar --create --file=mlib/com.greetings.jar --main-class=com.greetings.Main -C mods/com.greetings .

## run jars

java -p mlib -m com.greetings
