
package cdi.book.chapter2.qualifiers;

import java.util.Locale;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MyLocale {
    @Inject
    @MyQualifier
    private Locale myLocale;
    
}
