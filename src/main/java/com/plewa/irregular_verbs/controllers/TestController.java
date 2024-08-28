package com.plewa.irregular_verbs.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

    @GetMapping("/sessionTest")
    @ResponseBody
    public String getSession(HttpSession session) {
        Object object = session.getAttribute("num");
        int num;

        if(object == null){
            num = 1;
        }else{
            num = (int) session.getAttribute("num");
            num++;
        }
        session.setAttribute("num",num);
        return "session test    num -> " + num;
    }

}
