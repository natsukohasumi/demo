package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session-login")
public class LoginController {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index(){
        return "login-form";
    }

    @RequestMapping("/input-login")
    public String myPage(String email, String password){
        if (email.equals("test@example.com" ) && password.equals("123") ){
            session.setAttribute("email", email);
            session.setAttribute("password", password);
            
        } else { 
            return "login-form";
        
        }
        return "my-page";
       
        
    }

    @RequestMapping("/my-page-detail")
    public String  myPageDetail(){
        return "result-my-page";
    }
}
