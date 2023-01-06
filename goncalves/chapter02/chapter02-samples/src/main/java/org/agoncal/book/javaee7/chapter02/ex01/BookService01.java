
package org.agoncal.book.javaee7.chapter02.ex01;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author emaph
 */
public class BookService01 {

    @Inject
    private NumberGenerator01 numberGenerator;

    @Inject
    private EntityManager em;

    Date instanciationDate;


    // Lifecycle methods

    @PostConstruct
    private void initDate() {
        instanciationDate = new Date();
    }


    // Business methods

    public Book01 createBook(String title, Float price, String description) {
        Book01 book = new Book01(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        book.setInstanciationDate(instanciationDate);
        em.persist(book);
        return book;
    }

}
