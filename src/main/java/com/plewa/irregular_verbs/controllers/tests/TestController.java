package com.plewa.irregular_verbs.controllers.tests;

import com.plewa.irregular_verbs.entity.Thing;
import com.plewa.irregular_verbs.repository.ThingRepository;
import com.plewa.irregular_verbs.service.IrregularVerbService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

    private IrregularVerbService irregularVerbService;
    private ThingRepository thingRepository;

    public TestController(IrregularVerbService irregularVerbService, ThingRepository thingRepository) {
        this.irregularVerbService = irregularVerbService;
        this.thingRepository = thingRepository;
    }


    @GetMapping("/testImage")
    public String getImage(Model model) {
        Thing donkey = thingRepository.findThingById(4l);
        model.addAttribute("donkey", donkey);
        return "donkey-test";
    }

}
