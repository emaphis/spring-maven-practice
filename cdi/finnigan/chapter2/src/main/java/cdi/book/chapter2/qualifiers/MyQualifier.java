
package cdi.book.chapter2.qualifiers;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * Qualifier is an annotation that can be utilized
 * at injection points
 * @author emaph
 */
@Qualifier
@Retention(RUNTIME)
@Target( {TYPE, METHOD, FIELD, PARAMETER} )
public @interface MyQualifier { }
