
package cdi.book.chapter2.qualiermembers;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
@Target( {TYPE, METHOD, FIELD, PARAMETER} )
public @interface Book {
    
    Category value();
    
    @Nonbinding
    String description() default "";
    
}
