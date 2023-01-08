
package org.agoncal.book.javaee7.chapter02.ex06;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 * Default Injector
 * @author emaph
 */
public class BookService06 {

    @Inject
    @Default
    private NumberGenerator06 numberGenerator;

    // Lifecycle methods

    // Business methods
    public Book06 createBook(String title, Float price, String description) {
        Book06 book = new Book06(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }

}
