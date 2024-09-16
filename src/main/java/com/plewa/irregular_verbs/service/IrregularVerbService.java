package com.plewa.irregular_verbs.service;

import com.plewa.irregular_verbs.entity.IrregularVerb;
import com.plewa.irregular_verbs.repository.IrregularVerbRepository;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;

@Service
@Slf4j
public class IrregularVerbService extends JsonOperation{
    private IrregularVerbRepository irregularVerbRepository;

    public IrregularVerbService(IrregularVerbRepository irregularVerbRepository) {
        this.irregularVerbRepository = irregularVerbRepository;
    }

    public List<IrregularVerb> findAll() {
        return irregularVerbRepository.findAll();
    }


    private Set<Integer> setSetWithUniqueNumbers(int limit, int allVerbsSize) {
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        Random rnd = new Random();

        while (uniqueNumbers.size() < limit) {
            int randomNumber = rnd.nextInt(allVerbsSize);
            uniqueNumbers.add(randomNumber);
        }

        return uniqueNumbers;
    }


    public List<IrregularVerb> getUniqueVerbsList(int limit) {
        List<IrregularVerb> allIrregularVerbs = irregularVerbRepository.findAll();
        List<IrregularVerb> uniqueVerbs = new ArrayList<>();

        Set<Integer> uniqueNumbers = setSetWithUniqueNumbers(limit, allIrregularVerbs.size());

        for (Integer uniqueRandomNumber : uniqueNumbers) {
            uniqueVerbs.add(allIrregularVerbs.get(uniqueRandomNumber));
        }

        return uniqueVerbs;
    }


    public boolean checkIfAnswerWasCorrect(String randomVerb, String answer) {
        if (randomVerb.equals(answer)) {
            return true;
        } else {
            return false;
        }
    }


    public boolean checkIfTwoAnswersWasCorrect(HttpSession session, String answer1, String answer2) {
        IrregularVerb irregularRandomVerb = (IrregularVerb) session.getAttribute("randomIrregularVerb");

        if (irregularRandomVerb.getVerb2().equals(answer1) && irregularRandomVerb.getVerb3().equals(answer2)) {
            return true;
        } else {
            return false;
        }
    }



    public void increaseCorrectAnswersInSession(HttpSession session) {
        int correctAnswers = (int) session.getAttribute("correctAnswers");
        correctAnswers++;
        session.setAttribute("correctAnswers", correctAnswers);
    }


    public void increaseIncorrectAnswersInSession(HttpSession session) {
        int incorrectAnswers = (int) session.getAttribute("incorrectAnswers");
        incorrectAnswers++;
        session.setAttribute("incorrectAnswers", incorrectAnswers);
    }


    public void saveInSessionOneRandomIrregularVerb(HttpSession session) {
        List<IrregularVerb> allIrregularVerbs = findAll();
        IrregularVerb randomVerb = getOneRandomIrregularVerbFromList(allIrregularVerbs);
        session.setAttribute("randomVerb", randomVerb);
    }


    public IrregularVerb getOneRandomIrregularVerbFromList(List<IrregularVerb> irregularVerbList) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(irregularVerbList.size());
        return irregularVerbList.get(randomNumber);
    }

}
