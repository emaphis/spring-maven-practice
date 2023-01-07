
package org.agoncal.book.javaee7.chapter02.ex04;

import java.util.Random;

/**
 *
 * @author emaph
 */
public class IsbnGenerator04 implements NumberGenerator04 {

    @Override
    public String generateNumber() {
        return "13-84356-" + Math.abs(new Random().nextInt());
    }
}
