# Notes on Java 9 modules and maven.

# Paths
- For a module/library named  org.name.whatever
- For Maven builds   whatever/src/main/java/org/name/whatever/Whatever.java
  with module-info.java in the whatever/src directory
- For regular build system  whatever/src/org.name.whatever/org/name/whatever/Whatever.java
  with module-info.hava in the whatever/src/org.name.whatever directory

# Three names in a module:
- 