/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud_jar.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mperez
 */
@Entity
@Table(name = "CT_AREA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CtArea.findAll", query = "SELECT c FROM CtArea c")
    , @NamedQuery(name = "CtArea.findByIdarea", query = "SELECT c FROM CtArea c WHERE c.idarea = :idarea")
    , @NamedQuery(name = "CtArea.findByNombreArea", query = "SELECT c FROM CtArea c WHERE c.nombreArea = :nombreArea")
    , @NamedQuery(name = "CtArea.findByDescripcion", query = "SELECT c FROM CtArea c WHERE c.descripcion = :descripcion")})
public class CtArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idarea")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idarea;
    @Size(max = 200)
    @Column(name = "Nombre_Area")
    private String nombreArea;
    @Size(max = 350)
    @Column(name = "Descripcion")
    private String descripcion;

    public CtArea() {
    }

    public CtArea(int idarea) {
        this.idarea = idarea;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "mx.com.AEF.CtArea[ idarea=" + idarea + " ]";
    }
    
}
