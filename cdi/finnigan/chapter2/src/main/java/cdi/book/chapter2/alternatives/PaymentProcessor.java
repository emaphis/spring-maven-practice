
package cdi.book.chapter2.alternatives;

import javax.inject.Inject;


public class PaymentProcessor {
    private final Payment payment;

    @Inject
    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }
    
    
}
