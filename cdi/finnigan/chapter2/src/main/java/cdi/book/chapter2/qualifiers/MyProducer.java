
package cdi.book.chapter2.qualifiers;

import java.util.Locale;
import javax.enterprise.inject.Produces;

public class MyProducer {
    
    @Produces
    @MyQualifier
    public Locale getMyLocale() {
        return Locale.US;
    }
    
}
