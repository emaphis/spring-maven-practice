
package org.agoncal.book.javaee7.chapter02.ex02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emaph
 */
public class NumberGenerator02Test {

    @Test
    public void shouldCheckNumberIsThirteenDigits() {
        BookService02 bookService = new BookService02();
        Book02 book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
        assertTrue(book.getIsbn().startsWith("13"));
    }
}
