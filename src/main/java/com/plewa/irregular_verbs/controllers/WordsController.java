package com.plewa.irregular_verbs.controllers;

import com.plewa.irregular_verbs.entity.Thing;
import com.plewa.irregular_verbs.repository.ThingRepository;
import com.plewa.irregular_verbs.service.ThingService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String checkAnswerPOST(HttpSession session, RedirectAttributes redirectAttributes) {
        List<Thing> animals = thingService.getAllAnimals();
        session.setAttribute("things", animals);
        Thing randomAnimal = thingService.getOneRandomThingFromList(animals);
//        log.info("POST randomAnimal {}", randomAnimal.getPolishName());
        redirectAttributes.addFlashAttribute("randomThing", randomAnimal);

        return "redirect:/words/animals";
    }

    @GetMapping("/animals")
    public String getAnimals(HttpSession session, Model model) {
        List<Thing> animals = thingService.getAllAnimals();
        session.setAttribute("things", animals);

        Thing animal = (Thing) model.getAttribute("randomThing");
        model.addAttribute("randomThing",animal);
//        log.info("GET randomAnimal {}", animal.getPolishName());
//        log.info("animals left: {}", animals.size());
        return "words/words";
    }


    @PostMapping("/check-if-answer-is-correct-animals")
    public String checkIfAnswerIsCorrectAnimals(@RequestParam(defaultValue = "empty") String answer, Model model, HttpSession session, RedirectAttributes redirectAttributes) {
        Thing animal = (Thing) model.getAttribute("randomThing");
        List<Thing> animals = (List<Thing>) session.getAttribute("things");

        if (animal.getEnglishName().equals(answer)) {
            //send info that answer was correct TODO
            animals.remove(animal);

            if (animals.isEmpty()) {
                return "irregular_verbs/congratulations"; //TODO change congrats address
            }

            session.setAttribute("things", animals);
        }

        Thing randomAnimal = thingService.getOneRandomThingFromList(animals);
        redirectAttributes.addFlashAttribute("randomThing", randomAnimal);

        return"redirect:/words/animals";
    }





    @GetMapping("/food")
    public String getFood() {
        return "/words/words";
    }


}
