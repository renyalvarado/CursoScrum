package com.cursoscrum.mvc;

import com.cursoscrum.domain.User;
import com.cursoscrum.service.WiredUserService;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class LoginController {

    @RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
    @Transactional
    public String showHomePage(Map<String, Object> model) {
        User user = WiredUserService.defaultUsers.get(0);
        model.put("message", user);
        return "index";
    }
}
