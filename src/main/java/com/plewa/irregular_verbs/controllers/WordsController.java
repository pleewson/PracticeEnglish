package com.plewa.irregular_verbs.controllers;

import com.plewa.irregular_verbs.entity.Thing;
import com.plewa.irregular_verbs.repository.ThingRepository;
import com.plewa.irregular_verbs.service.ThingService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/words")
public class WordsController {

    private ThingService thingService;

    public WordsController(ThingService thingService) {
        this.thingService = thingService;
    }

    @GetMapping("/home")
    public String getHome() {
        return "/words/home";
    }


//    @PostMapping("/animalsPOST")
//    public String checkAnswerPOST(HttpSession session) {
//        List<Thing> animals = thingService.getAllAnimals();
//        Thing randomAnimal = thingService.getOneRandomThingFromList(animals);
//        session.setAttribute("things", animals);
//        session.setAttribute("randomAnimal", randomAnimal);
//
//        return "redirect:/words/animals";
//    }


    @PostMapping("/wordsPOST")
    public String wordsPOST(HttpSession session, @RequestParam String categoryName) {
        log.info("categoryName {}",categoryName);
        List<Thing> allThings = thingService.getAllThingsByCategory(categoryName);
        log.info("list size {} ", allThings.size());
        Thing randomThing = thingService.getOneRandomThingFromList(allThings);
        session.setAttribute("allThings", allThings);
        session.setAttribute("randomThing", randomThing);

        return "redirect:/words/words";
    }



    @GetMapping("/words")
    public String getThings() {
        return "words/words";
    }


    @PostMapping("/check-if-answer-is-correct-words")
    public String checkIfAnswerIsCorrectPOST(@RequestParam(defaultValue = "empty") String answer, HttpSession session) {
        List<Thing> allThings = (List<Thing>) session.getAttribute("allThings");
        Thing randomThing =  (Thing) session.getAttribute("randomThing");

        if (randomThing.getEnglishName().equals(answer)) {
            //send info that answer was correct TODO
            allThings.remove(randomThing);

            if (allThings.isEmpty()) {
                return "irregular_verbs/congratulations"; //TODO change congrats address
            }

            session.setAttribute("allThings", allThings);
        }

        log.info("things left {} ", allThings.size());
        randomThing = thingService.getOneRandomThingFromList(allThings);
        session.setAttribute("randomThing", randomThing);

        return"redirect:/words/words";
    }
}
