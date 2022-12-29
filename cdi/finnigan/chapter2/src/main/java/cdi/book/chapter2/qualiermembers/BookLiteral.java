
package cdi.book.chapter2.qualiermembers;

import javax.enterprise.util.AnnotationLiteral;


public class BookLiteral extends AnnotationLiteral<Book> implements Book {
    private final Category category;
    private final String description;
    
    public BookLiteral(Category category, String description) {
        this.category = category;
        this.description = description;
    }
    
    @Override
    public Category value() {
        return category;
    }

    @Override
    public String description() {
        return description;
    }
    
}
