package com.leroydev.entity;

public class User {

    private final String name;

    public User(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}