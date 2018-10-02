package javamodularity.maven.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(String[] args) {

        Book modularityBook =
        new Book("Java 9 Modularity", "Modularize all the things!");
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(modularityBook);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }
    }
}
