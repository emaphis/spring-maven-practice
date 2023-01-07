
package org.agoncal.book.javaee7.chapter02.ex01;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Vetoed;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 *
 * @author emaph
 */
@Vetoed
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
    @Transactional
    public Book01 createBook(String title, Float price, String description) {
        Book01 book = new Book01(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        book.setInstanciationDate(instanciationDate);
        em.persist(book);
        return book;
    }

}
