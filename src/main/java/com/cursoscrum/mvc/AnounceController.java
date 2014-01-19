/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cursoscrum.mvc;

import com.cursoscrum.domain.Anuncio;
import com.cursoscrum.domain.User;
import com.cursoscrum.service.AnounceService;
import java.sql.Date;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author naramirez
 */

@Controller
@SessionAttributes("anounces")
public class AnounceController {
    private List<Anuncio> anounces;
    private AnounceService service;
    
    

    public List<Anuncio> getAnounces() {
        return anounces;
    }

    public void setAnounces(List<Anuncio> anounces) {
        this.anounces = anounces;
    }

    public AnounceService getService() {
        return service;
    }

    @Inject
    public void setService(AnounceService service) {
        this.service = service;
    }
    
    @RequestMapping(value = {"/agregar"}, method = RequestMethod.POST)
    public void addAnouncesPage(
            @RequestParam("titulo") String titulo,
            @RequestParam("productos") String productos,
            @RequestParam("comercio") String comercio,
            @RequestParam("direccion") String direccion,
            Map<String, Object> model){
        
        Anuncio anuncio = new Anuncio(titulo, productos, new Date(System.currentTimeMillis()), comercio, (User) model.get("user"));
    }
}
