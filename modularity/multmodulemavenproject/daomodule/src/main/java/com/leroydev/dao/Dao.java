
package com.leroydev.dao;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author emaphis
 * @param <T>
 */
public interface Dao<T> {

    Optional<T> findByID(int id);

    List<T> findAll();
}
