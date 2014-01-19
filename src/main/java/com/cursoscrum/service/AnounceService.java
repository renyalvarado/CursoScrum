/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cursoscrum.service;

import com.cursoscrum.domain.Anuncio;
import java.util.List;

/**
 *
 * @author naramirez
 */
public interface AnounceService {
    List<Anuncio> getAnuncios();
    void addAnuncio(Anuncio anuncio);
}
