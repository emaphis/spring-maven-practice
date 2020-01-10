package com.leroydev.dao;

import java.util.List;
import java.util.Optional;

/**
 * Dao interface
 *
 * @param <T> Entity to Store
 */
public interface Dao<T> {

    Optional<T> findById(int id);

    List<T> findAll();

}
