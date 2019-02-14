package org.springguru.chumick.sfgpetclinick.service;

import java.util.Set;
import java.util.function.Predicate;

public interface CrudService<T, ID> {
    T save(T owner);

    T findById(ID id);
    Set<T> findAll();

    void delete(T object);
    void deleteById(ID id);
}
