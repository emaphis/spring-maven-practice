/*
 * JDK 14 Preview features.
 */
package com.leroydev.examples;

public record Person (String firstName, String lastName) {

}

/*
public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "[firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode() + firstName.hashCode() + lastName.hashCode();
    }

}
*/
