
package org.agoncal.book.javaee7.chapter02.ex06;

import java.util.Random;
import javax.enterprise.inject.Default;

/**
 * The IsbnGenerator Bean with the @Default Qualifier
 * @author emaph
 */
@Default
public class IsbnGenerator06 implements NumberGenerator06 {

    @Override
    public String generateNumber() {
        return "13-84356-" + Math.abs(new Random().nextInt());
    }
}
