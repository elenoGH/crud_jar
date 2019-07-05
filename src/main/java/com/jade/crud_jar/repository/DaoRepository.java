/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud_jar.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mperez
 */
@Repository
public interface DaoRepository<T, Id extends Serializable> {
     
    @Bean
    public void persist(T entity);
     
    @Bean
    public void update(T entity);
     
    @Bean
    public T findById(Id id);
     
    @Bean
    public void delete(T entity);
     
    @Bean
    public List<T> findAll();
    
    @Bean
    public void deleteAll();
}