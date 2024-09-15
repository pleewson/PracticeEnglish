package com.plewa.irregular_verbs.service;

import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

public class JsonOperation {

    public void saveJsonInModelWithIncorrectOutput(RedirectAttributes redirectAttributes) {
        Map<String, String> mapJSON = new HashMap<>();
        mapJSON.put("previousAnswer", "incorrect");
        redirectAttributes.addFlashAttribute("previousAnswer", mapJSON);
    }


    public void saveJsonInModelWithIncorrectOutput(Model model) {
        Map<String, String> mapJSON = new HashMap<>();
        mapJSON.put("previousAnswer", "incorrect");
        model.addAttribute("previousAnswer", mapJSON);
    }


    public void saveJsonInModelWithCorrectOutput(RedirectAttributes redirectAttributes) {
        Map<String, String> mapJSON = new HashMap<>();
        mapJSON.put("previousAnswer", "correct");
        redirectAttributes.addFlashAttribute("previousAnswer", mapJSON);
    }


    public void saveJsonInModelWithCorrectOutput(Model model) {
        Map<String, String> mapJSON = new HashMap<>();
        mapJSON.put("previousAnswer", "correct");
        model.addAttribute("previousAnswer", mapJSON);
    }
}
