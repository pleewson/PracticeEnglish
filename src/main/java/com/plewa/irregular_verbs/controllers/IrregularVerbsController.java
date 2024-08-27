package com.plewa.irregular_verbs.controllers;

import com.plewa.irregular_verbs.service.IrregularVerbService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class IrregularVerbsController {

    private IrregularVerbService irregularVerbService;

    public IrregularVerbsController(IrregularVerbService irregularVerbService) {
        this.irregularVerbService = irregularVerbService;
    }

    @GetMapping("/allIrregularVerbs")
    public String printAllIrregularVerbs(Model model) {
        model.addAttribute("irregularVerbs", irregularVerbService.findAll());
        return "allverbs";
    }


    @GetMapping("/setLimit")
    public String getLimitPage() {
        return "limitdecide";
    }

    @PostMapping("/fill2and3verb")
    @ResponseBody
    public String fill2And3Verb(@RequestParam String limitVerbs) {
        return "" + limitVerbs;
    }

}
