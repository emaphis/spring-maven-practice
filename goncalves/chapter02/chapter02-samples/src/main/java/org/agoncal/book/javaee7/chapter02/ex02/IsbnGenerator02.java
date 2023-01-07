
package org.agoncal.book.javaee7.chapter02.ex02;

import java.util.Random;

/**
 *
 * @author emaph
 */
public class IsbnGenerator02 implements NumberGenerator02 {

    @Override
    public String generateNumber() {
        return "13-84356-" + Math.abs(new Random().nextInt());
    }
}
