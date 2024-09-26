package com.plewa.irregular_verbs.controllers;

import com.plewa.irregular_verbs.service.TranslatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequestMapping("/translate")
public class TranslatorController {
    private final TranslatorService translatorService;

    public TranslatorController(TranslatorService translatorService) {
        this.translatorService = translatorService;
    }


    @GetMapping("/PL-EN")
    public String getTranslatePolishToEnglish(Model model) {
        return "translator/translator_polish_to_english";
    }


    @PostMapping("/translatePL-EN")
    public String translatePolishToEnglishPOST(@RequestParam(defaultValue = "empty") String textToTranslate, RedirectAttributes redirectAttributes) throws Exception {
        String translatedText = translatorService.translateTextPolishToEnglish(textToTranslate);
        redirectAttributes.addFlashAttribute("translatedText", translatedText);
        redirectAttributes.addFlashAttribute("textToTranslate", textToTranslate);

        log.info("translated textToTranslate: {},  translatedText: {}", textToTranslate, translatedText);

        return "redirect:/translate/PL-EN";
    }


    @GetMapping("/EN-PL")
    public String getTranslateEnglishToPolish() {
        return "translator/translator_english_to_polish";
    }


    @PostMapping("/translateEN-PL")
    public String translateEnglishToPolishPOST(@RequestParam(defaultValue = "empty") String textToTranslate, RedirectAttributes redirectAttributes) throws Exception {
        String translatedText = translatorService.translateTextEnglishToPolish(textToTranslate);
        redirectAttributes.addFlashAttribute("translatedText", translatedText);
        redirectAttributes.addFlashAttribute("textToTranslate", textToTranslate);

        log.info("translated textToTranslate: {},  translatedText: {}", textToTranslate, translatedText);

        return "redirect:/translate/EN-PL";
    }
}
