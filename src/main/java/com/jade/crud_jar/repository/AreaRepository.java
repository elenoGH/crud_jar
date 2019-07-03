/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud_jar.repository;

/**
 *
 * @author mperez
 */

import com.jade.crud_jar.Area;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AreaRepository extends JpaRepository<CtUsuarios, Long>{
    
}
