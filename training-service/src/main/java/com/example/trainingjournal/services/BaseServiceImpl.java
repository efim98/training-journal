package com.example.trainingjournal.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public abstract class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    private JpaRepository<T, ID> repository;
    public BaseServiceImpl(JpaRepository<T, ID> repository){
        this.repository = repository;
    }
    @Transactional(readOnly =true)
    public List<T> getAll() {
        return repository.findAll();
    }
    @Transactional(readOnly =true)
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }
    @Transactional
    public T save(T entity) {
        return repository.save(entity);
    }
    @Transactional
    public void delete(T entity) {
        repository.delete(entity);
    }
    @Transactional
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }
}
