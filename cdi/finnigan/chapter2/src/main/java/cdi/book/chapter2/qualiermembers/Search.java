
package cdi.book.chapter2.qualiermembers;

import java.lang.annotation.Annotation;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@RequestScoped
public class Search {
    @Inject
    @Book(Category.NONFICTION)
    BookSearch search;
    
    @Inject
    @Any
    Instance<BookSearch> bookSearch;
    
    public BookSearch getSearch(boolean fiction) {
        Annotation qualifier = fiction ? new BookLiteral(Category.FICTION, "") : new BookLiteral(Category.NONFICTION, "Non Fiction");
        return bookSearch.select(qualifier).get();
    }
    
}
