package javamodularity.maven.example;

public class Book {
    private final String title;
    private final String description;

    public Book(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}