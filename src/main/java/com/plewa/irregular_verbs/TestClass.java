package com.plewa.irregular_verbs;

import com.deepl.api.TextResult;
import com.deepl.api.Translator;
import com.plewa.irregular_verbs.service.TranslatorService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static TranslatorService translatorService = new TranslatorService();

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList instanceof Serializable);

        try {
            System.out.println(translatorService.translateTextPolishToEnglish("czesc to ja"));
            System.out.println(translatorService.translateTextEnglishToPolish("i'm living in london"));
        }catch (Exception ex){
            System.out.println("exception zostal rzucony");
        }
    }

}
