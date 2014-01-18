package com.cursoscrum.mvc;

import com.cursoscrum.domain.User;
import com.cursoscrum.service.IUserService;
import java.util.Map;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author cleteci
 */
@Controller
@SessionAttributes("user")
public class UserValidatorController {
    
    private User user;
    
    private IUserService userService;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IUserService getUserService() {
        return userService;
    }

    @Inject
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping(value = {"/Home"}, method = RequestMethod.POST)
    public String showHomePage(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Map<String, Object> model) {
        User tmpUser = new User();
        
        tmpUser.setUsername(username);
        tmpUser.setPassword(password);
        
        setUser(userService.findUser(tmpUser));
                      
        if(user == null){
            model.put("message", "Usuario o contraseña inválidos");
            return "index";
        } else {
            model.put("message", "Sesión Iniciada");            
            model.put("user", user);
            return "home";
        }
        
    }    
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.GET)
    public String logout(Map<String, Object> model, SessionStatus status) {
        user = null;
        status.setComplete();        
        return "redirect:/";
    }
}
