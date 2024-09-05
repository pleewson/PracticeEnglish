package com.plewa.irregular_verbs.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(HttpSession session){
        session.invalidate();
        return "home";
    }

}
