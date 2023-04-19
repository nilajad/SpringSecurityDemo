package com.example.SpringSecurityDemo;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("/login")
    public String login() {
        return "login.jsp";
    }

    @RequestMapping("/home")
    public String home2() {
        return "home.jsp";
    }

    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal){
        return principal;
    }
}
