package com.plewa.irregular_verbs.controllers;

import com.plewa.irregular_verbs.entity.IrregularVerb;
import com.plewa.irregular_verbs.service.IrregularVerbService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    IrregularVerbService irregularVerbService;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        List<IrregularVerb> irregularVerbs = irregularVerbService.findAll();
        return irregularVerbs.toString();
    }

}
