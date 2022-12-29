
package cdi.book.chapter2.alternatives;

import javax.enterprise.inject.Alternative;

@Alternative
@Admin
@User
public class MockAccount implements Account {
}
