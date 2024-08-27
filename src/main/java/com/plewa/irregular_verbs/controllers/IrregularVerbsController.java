package com.plewa.irregular_verbs.controllers;

import com.plewa.irregular_verbs.service.IrregularVerbService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IrregularVerbsController {

    private IrregularVerbService irregularVerbService;

    public IrregularVerbsController(IrregularVerbService irregularVerbService){
        this.irregularVerbService = irregularVerbService;
    }

    @GetMapping("/allIrregularVerbs")
    public String printAllIrregularVerbs(Model model){
        model.addAttribute("irregularVerbs", irregularVerbService.findAll());
        return "allIrregularVerbs";
    }

}
