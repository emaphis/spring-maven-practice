
package cdi.book.chapter2.alternatives;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class AccountManager {
    @Inject
    @Admin
    Account account;
}
