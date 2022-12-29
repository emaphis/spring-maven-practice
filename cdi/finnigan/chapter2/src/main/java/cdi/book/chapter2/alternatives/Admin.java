
package cdi.book.chapter2.alternatives;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
@Target( {TYPE, METHOD, FIELD, PARAMETER } )
public @interface Admin {
}
