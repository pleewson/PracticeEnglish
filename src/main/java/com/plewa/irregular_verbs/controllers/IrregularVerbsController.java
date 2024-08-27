package com.plewa.irregular_verbs.controllers;

import com.plewa.irregular_verbs.operations.irregularVerbs;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IrregularVerbsController {

    static String[][] irrArr = irregularVerbs.irregularVerbsArray;

    @GetMapping("/allIrregularVerbs")
    public String printAllIrregularVerbs(Model model){
        model.addAttribute("irrArr", irrArr);
        return "allIrregularVerbs";
    }

}
