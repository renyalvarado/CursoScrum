/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cursoscrum.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author naramirez
 */
@Entity
public class Anuncio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    
    private List<Producto> productos;
    

    private Date fechaPublicacion;
    
    private String nombreComercio;
    
    private User comerciante;

    public Anuncio(String titulo, List<Producto> productos, Date fechaPublicacion, String nombreComercio, User comerciante) {
        this.titulo = titulo;
        this.productos = productos;
        this.fechaPublicacion = fechaPublicacion;
        this.nombreComercio = nombreComercio;
        this.comerciante = comerciante;
    }

    public Anuncio() {
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombreComercio() {
        return nombreComercio;
    }

    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    public User getComerciante() {
        return comerciante;
    }

    public void setComerciante(User comerciante) {
        this.comerciante = comerciante;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anuncio)) {
            return false;
        }
        Anuncio other = (Anuncio) object;
        if (!this.nombreComercio.equals(other.nombreComercio) ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cursoscrum.domain.Anuncio[ id=" + id + " ]";
    }
    
}
