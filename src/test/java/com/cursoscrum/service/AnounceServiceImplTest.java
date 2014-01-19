/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cursoscrum.service;

import com.cursoscrum.domain.Anuncio;
import com.cursoscrum.domain.User;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author naramirez
 */
public class AnounceServiceImplTest {
    
    public AnounceServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAnuncios method, of class AnounceServiceImpl.
     */
    @Test
    public void testGetAnuncios() {
        System.out.println("getAnuncios");
        AnounceServiceImpl instance = new AnounceServiceImpl(AnounceServiceImpl.defaultAnuncios);
        List<Anuncio> expResult = AnounceServiceImpl.defaultAnuncios;
        List<Anuncio> result = instance.getAnuncios();
        assertEquals(expResult, result);
    }

    /**
     * Test of addAnuncio method, of class AnounceServiceImpl.
     */
    @Test
    public void testAddAnuncio() {
        System.out.println("addAnuncio");
        List<Anuncio> expected = AnounceServiceImpl.defaultAnuncios;
        Anuncio anuncio = new Anuncio("Titulo1", null, new Date(10000L),"Latina", new User());
        AnounceServiceImpl instance = new AnounceServiceImpl(new ArrayList<Anuncio>());
        instance.addAnuncio(anuncio);
        assertArrayEquals(expected.toArray(), instance.getAnuncios().toArray());
    }
    
}
