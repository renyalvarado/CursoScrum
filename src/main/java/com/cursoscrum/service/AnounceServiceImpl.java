/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cursoscrum.service;

import com.cursoscrum.domain.Anuncio;
import com.cursoscrum.domain.Producto;
import com.cursoscrum.domain.User;
import java.sql.Date;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Named;

/**
 *
 * @author naramirez
 */

@Named
public class AnounceServiceImpl implements AnounceService{
    
    public static final List<Anuncio> defaultAnuncios = Arrays.asList(new Anuncio[]{
        new Anuncio("Titulo1", null, new Date(10000L),"Latina", new User())
    });
    
    private List<Anuncio> anuncios;
    
    @Override
    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    @Override
    public void addAnuncio(Anuncio anuncio) {
        anuncios.add(anuncio);
    }

    public AnounceServiceImpl(List<Anuncio> list) {
        anuncios = list;
    }
}
