
package com.leroydev.userdao;

import java.util.Map;
import com.leroydev.entity.*;
import com.leroydev.dao.*;

/**
 *
 * @author emaphis
 */
public class UserDao implements Dao<User> {

    private final Map<Integer, User> users;
}
