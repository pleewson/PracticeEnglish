package com.plewa.irregular_verbs.controllers;

import com.plewa.irregular_verbs.entity.IrregularVerb;
import com.plewa.irregular_verbs.service.IrregularVerbService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

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

    @PostMapping("/fill2and3verbPOST")
    public String fill2And3VerbPOST(@RequestParam int limitVerbs, HttpSession session) {
        List<IrregularVerb> uniqueIrregularVerbs = irregularVerbService.getUniqueVerbsList(limitVerbs);

        session.setAttribute("uniqueIrregularVerbs", uniqueIrregularVerbs);
        session.setAttribute("progress", 0);
        session.setAttribute("limit", limitVerbs);

        return "redirect:/fill2and3verb";
    }

    @GetMapping("/fill2and3verb")
    public String fill2And3VerbGET(HttpSession session, Model model, HttpServletRequest request) {
        List<IrregularVerb> uniqueIrregularVerbs = (List<IrregularVerb>) session.getAttribute("uniqueIrregularVerbs");
        int progress = (int) session.getAttribute("progress");

        log.info("{}progress", progress);
        log.info("randomIrregularVerb {} ", session.getAttribute("randomIrregularVerb"));


        if (session.getAttribute("randomIrregularVerb") != null) {
            String answer1 = request.getParameter("answer1");
            String answer2 = request.getParameter("answer2");

            IrregularVerb irregularVerb = (IrregularVerb) session.getAttribute("randomIrregularVerb");
            if (irregularVerb.getVerb2().equals(answer1) && irregularVerb.getVerb3().equals(answer2)) {
                uniqueIrregularVerbs.remove(irregularVerb);
                progress++;

                if(uniqueIrregularVerbs.size() == 0){
                    return "congratulations";
                }

                session.setAttribute("uniqueIrregularVerbs", uniqueIrregularVerbs);
                session.setAttribute("progress", progress);
            }
        }

        IrregularVerb randomIrregularVerb = irregularVerbService.getOneIrregularVerbFromUniqueList(uniqueIrregularVerbs);

        session.setAttribute("randomIrregularVerb", randomIrregularVerb);

        return "fillverbs_2and3_limit";
    }
}
