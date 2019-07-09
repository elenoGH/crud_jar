/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud_jar.repository;

import com.jade.crud_jar.model.CtArea;
import org.springframework.data.repository.Repository;
import java.util.List;

/**
 * @author mperez
 */
//aqui se hacen las consultas query hibernate
public interface AreaRepository extends Repository<CtArea, Integer> {
    
    void delete(CtArea user);

    List<CtArea> findAll();

    //CtArea findOne(int idarea);

    CtArea save(CtArea user);
}
