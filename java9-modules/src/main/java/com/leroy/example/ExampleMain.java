
package com.leroy.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ExampleMain {
    
    public static void main(String[] args) {
        Document d = Jsoup.parse("<a href='http://www.example.com'>Example</a>");
        String s = d.getElementsByTag("a")
                        .first()
                        .attr("href");
        System.out.println(s);
    }

}