
package org.agoncal.book.javaee7.chapter02.ex04;

import javax.inject.Inject;

/**
 *
 * @author emaph
 */
public class BookService04 {

    @Inject
    private NumberGenerator04 numberGenerator;

    // Lifecycle methods

    // Business methods
    public Book04 createBook(String title, Float price, String description) {
        Book04 book = new Book04(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }

}
