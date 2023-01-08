
package org.agoncal.book.javaee7.chapter02.ex06;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author emaph
 */
public class NumberGenerator06Test {

    protected static Weld weld;
    protected static WeldContainer container;

    @BeforeClass
    public static void init() {
        weld = new Weld();
        container = weld.initialize();
    }

    @AfterClass
    public static void close() {
        weld.shutdown();
    }


    @Test
    public void shouldCheckNumberIsThirteenDigits() {
        BookService06 bookService = container.instance().select(BookService06.class).get();
        Book06 book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
        assertTrue(book.getIsbn().startsWith("13"));
    }
}
