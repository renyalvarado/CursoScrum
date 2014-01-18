package com.cursoscrum.mvc;

import com.cursoscrum.domain.User;
import com.cursoscrum.service.IUserService;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.springframework.web.bind.support.SessionStatus;
/**
 *
 * @author cleteci
 */
public class UserValidatorControllerTest {
    
    public UserValidatorControllerTest() {
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
     * Test of showHomePage method, of class UserValidatorController.
     */
    @Test
    public void testLoginSuccess() {
        String username = "";
        String password = "";
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        
        IUserService userService = mock(IUserService.class);
        when(userService.findUser(any(User.class))).thenReturn(user);
        Map<String, Object> model = new HashMap<String, Object>();
        
        UserValidatorController controller = new UserValidatorController();
        controller.setUserService(userService);

        String expResult = "home";
        String result = controller.showHomePage(username, password, model);
        
        assertEquals(expResult, result);        
        assertEquals(controller.getUser(), user);
    }
    
    @Test
    public void testLoginFail() {
        String username = "";
        String password = "";
        
        IUserService userService = mock(IUserService.class);
        when(userService.findUser(any(User.class))).thenReturn(null);
        
        Map<String, Object> model = new HashMap<String, Object>();
        
        UserValidatorController controller = new UserValidatorController();
        controller.setUserService(userService);

        String expResult = "index";
        String result = controller.showHomePage(username, password, model);
        
        assertEquals(expResult, result);        
        assertNull(controller.getUser());
    }
    
    @Test
    public void testLogout() {
        String username = "";
        String password = "";
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        
        IUserService userService = mock(IUserService.class);
        when(userService.findUser(any(User.class))).thenReturn(user);
        Map<String, Object> model = new HashMap<String, Object>();
        
        UserValidatorController controller = new UserValidatorController();
        controller.setUserService(userService);
        
        controller.showHomePage(username, password, model);
        
        String expResult = "redirect:/";
        SessionStatus sessionStatus= mock(SessionStatus.class);
        String result = controller.logout(model, sessionStatus);
        
        assertEquals(expResult, result);
        assertNull(controller.getUser());
    }
}