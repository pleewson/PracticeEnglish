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


    @PostMapping("/animalsPOST")
    public String checkAnswerPOST(HttpSession session) {
        List<Thing> animals = thingService.getAllAnimals();
        Thing randomAnimal = thingService.getOneRandomThingFromList(animals);
        session.setAttribute("things", animals);
        session.setAttribute("randomAnimal", randomAnimal);

        return "redirect:/words/animals";
    }


    @GetMapping("/animals")
    public String getAnimals() {
        return "words/words";
    }


    @PostMapping("/check-if-answer-is-correct-animals")
//    @PostMapping("/check-if-answer-is-correct-things")
    public String checkIfAnswerIsCorrectAnimals(@RequestParam(defaultValue = "empty") String answer, HttpSession session) {
        Thing randomAnimal =  (Thing) session.getAttribute("randomAnimal");
        List<Thing> animals = (List<Thing>) session.getAttribute("things");
        if (randomAnimal.getEnglishName().equals(answer)) {
            //send info that answer was correct TODO
            animals.remove(randomAnimal);

            if (animals.isEmpty()) {
                return "irregular_verbs/congratulations"; //TODO change congrats address
            }

            session.setAttribute("things", animals);
        }

        log.info("animals left {} ", animals.size());
        randomAnimal = thingService.getOneRandomThingFromList(animals);
        session.setAttribute("randomAnimal", randomAnimal);

        return"redirect:/words/animals";
    }


    @GetMapping("/food")
    public String getFood() {
        return "/words/words";
    }


}
