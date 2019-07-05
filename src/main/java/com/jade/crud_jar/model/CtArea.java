/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jade.crud_jar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author mperez
 */
@Entity
@Table(name = "CT_AREA")
public class CtArea {

    private static final long serialVersionUID = 1L;
    @Id
    //@Basic(optional = false)
    //@NotNull
    //@Column(name = "L_IdArea")
    private Integer lIdArea;
    //@Size(max = 200)
    //@Column(name = "Nombre_Area")
    private String nombreArea;
    //@Size(max = 350)
    //@Column(name = "Descripcion")
    private String descripcion;

    public CtArea() {
    }

    public CtArea(Integer lIdArea) {
        this.lIdArea = lIdArea;
    }

    public CtArea(String john, String johndomaincom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getLIdArea() {
        return lIdArea;
    }

    public void setLIdArea(Integer lIdArea) {
        this.lIdArea = lIdArea;
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
    public int hashCode() {
        int hash = 0;
        hash += (lIdArea != null ? lIdArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CtArea)) {
            return false;
        }
        CtArea other = (CtArea) object;
        if ((this.lIdArea == null && other.lIdArea != null) || (this.lIdArea != null && !this.lIdArea.equals(other.lIdArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jade.crud_jar.model.CtArea[ lIdArea=" + lIdArea + " ]";
    }
    
}
