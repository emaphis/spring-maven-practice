
package org.agoncal.book.javaee7.chapter02.ex02;


/**
 * A BookService POJO Creating Dependencies Using the New Keyword
 * @author emaph
 */
public class BookService02 {

    private NumberGenerator02 numberGenerator;

    public BookService02() {
        this.numberGenerator = new IsbnGenerator02();
    }

    // Lifecycle methods

    // Business methods
    public Book02 createBook(String title, Float price, String description) {
        Book02 book = new Book02(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }

}
