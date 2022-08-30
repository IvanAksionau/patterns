package com.ivan.practice.solidprinciple.intersegrega.service;

import com.ivan.practice.solidprinciple.intersegrega.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);
}
