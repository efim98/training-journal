package com.example.trainingjournal.services;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {
    List<T> getAll();
    Optional<T> findById(ID id);
    T save(T entity);
    void delete(T entity);
    boolean existsById(ID id);
}
