/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cursoscrum.mvc;

import com.cursoscrum.domain.Anuncio;
import com.cursoscrum.service.AnounceService;
import java.util.List;
import java.util.Map;
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
public class AnounceControllerTest {
    
    public AnounceControllerTest() {
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
     * Test of getAnounces method, of class AnounceController.
     */
    @Test
    public void testGetAnounces() {
        System.out.println("getAnounces");
        AnounceController instance = new AnounceController();
        List<Anuncio> expResult = null;
        List<Anuncio> result = instance.getAnounces();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnounces method, of class AnounceController.
     */
    @Test
    public void testSetAnounces() {
        System.out.println("setAnounces");
        List<Anuncio> anounces = null;
        AnounceController instance = new AnounceController();
        instance.setAnounces(anounces);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getService method, of class AnounceController.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        AnounceController instance = new AnounceController();
        AnounceService expResult = null;
        AnounceService result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setService method, of class AnounceController.
     */
    @Test
    public void testSetService() {
        System.out.println("setService");
        AnounceService service = null;
        AnounceController instance = new AnounceController();
        instance.setService(service);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAnouncesPage method, of class AnounceController.
     */
    @Test
    public void testAddAnouncesPage() {
        System.out.println("addAnouncesPage");
        String titulo = "";
        String productos = "";
        String comercio = "";
        String direccion = "";
        Map<String, Object> model = null;
        AnounceController instance = new AnounceController();
        instance.addAnouncesPage(titulo, productos, comercio, direccion, model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
