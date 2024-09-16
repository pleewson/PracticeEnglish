package com.plewa.irregular_verbs.service;

import com.deepl.api.TextResult;
import com.deepl.api.Translator;
import org.springframework.stereotype.Service;

@Service
public class TranslatorService {

    private Translator translator;

    public TranslatorService() {
        String authKey = "02c1425e-b4a0-4f45-bd9c-279bd1fda69b:fx";  // Replace with your key
        translator = new Translator(authKey);
    }

    public String translateTextPolishToEnglish(String text) throws Exception{
        TextResult textResult = translator.translateText(text, "PL", "en-GB");
        return textResult.getText();
    }

    public String translateTextEnglishToPolish(String text) throws Exception{
        TextResult textResult = translator.translateText(text, null, "PL");
        return textResult.getText();
    }

}
