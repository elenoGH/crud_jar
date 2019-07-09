/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud_jar.service;

import com.jade.crud_jar.model.CtArea;
import java.util.List;

/**
 *
 * @author mperez
 */
public interface AreaService {
    
    CtArea create(CtArea user);

    //CtArea delete(int idarea);

    List<CtArea> findAll();

    //CtArea findById(int idarea);

    CtArea update(CtArea user);
}
