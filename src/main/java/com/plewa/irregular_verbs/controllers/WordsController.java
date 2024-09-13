package com.plewa.irregular_verbs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/words")
public class WordsController {

    @GetMapping("/home")
    public String getHome(){
        return "/words/home";
    }

}
