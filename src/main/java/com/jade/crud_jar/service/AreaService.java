/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud_jar.service;

import com.jade.crud_jar.dao.daoArea;
import com.jade.crud_jar.model.CtArea;
import java.util.List;

/**
 *
 * @author mperez
 */
public class AreaService {
    
    private static daoArea dar;
    
    public AreaService() {
        dar = new daoArea();
    }
    
    public void persist(CtArea entity) {
        dar.openCurrentSessionwithTransaction();
        dar.persist(entity);
        dar.closeCurrentSessionwithTransaction();
    }
 
    public void update(CtArea entity) {
        dar.openCurrentSessionwithTransaction();
        dar.update(entity);
        dar.closeCurrentSessionwithTransaction();
    }
 
    public CtArea findById(String id) {
        dar.openCurrentSession();
        CtArea book = dar.findById(id);
        dar.closeCurrentSession();
        return book;
    }
 
    public void delete(String id) {
        dar.openCurrentSessionwithTransaction();
        CtArea book = dar.findById(id);
        dar.delete(book);
        dar.closeCurrentSessionwithTransaction();
    }
 
    public List<CtArea> findAll() {
        dar.openCurrentSession();
        List<CtArea> books = dar.findAll();
        dar.closeCurrentSession();
        return books;
    }
 
    public void deleteAll() {
        dar.openCurrentSessionwithTransaction();
        dar.deleteAll();
        dar.closeCurrentSessionwithTransaction();
    }
 
    public daoArea dar() {
        return dar;
    }
}
