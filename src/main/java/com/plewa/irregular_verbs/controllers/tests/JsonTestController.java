package com.plewa.irregular_verbs.controllers.tests;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class JsonTestController {


    @GetMapping("/jsonTest")
    public String jsonAnswer(@RequestParam(defaultValue = "default") String answer, Model model) {
        Map<String, String> jsonAnswer = new HashMap<>();

        if(!answer.equals("default")) {
            if (answer.equals("a")) {
                jsonAnswer.put("answer", "correct");
            } else {
                jsonAnswer.put("answer", "incorrect");
            }
        }

        log.info("{}",jsonAnswer);
        model.addAttribute("answer",jsonAnswer);
        return "irregular_verbs/test";
    }

}
