/*
 *
 */
package com.leroydev.examples;

/**
 *
 * @author emaphis
 */
public class App {

    public static void main(String[] args) {
        String javaVer = System.getProperty("java.version");
        System.out.println("Hello JDK " + javaVer + " App");
        System.out.println();

        Person john = new Person("John", "Doe");
        Person jane = new Person("Jane", "Doe");
        Person johnCopy = new Person("John", "Doe");

        System.out.println(john.firstName());
        System.out.println(john.lastName());
        System.out.println(john);
        System.out.println(john.hashCode());
        System.out.println(jane.hashCode());
        System.out.println(johnCopy.hashCode());
    }

}
