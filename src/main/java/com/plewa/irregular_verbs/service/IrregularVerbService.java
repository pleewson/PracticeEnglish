package com.plewa.irregular_verbs.service;

import com.plewa.irregular_verbs.entity.IrregularVerb;
import com.plewa.irregular_verbs.repository.IrregularVerbRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class IrregularVerbService {
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

    public IrregularVerb getOneRandomIrregularVerbFromList(List<IrregularVerb> irregularVerbList) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(irregularVerbList.size());
        return irregularVerbList.get(randomNumber);
    }


    //set progress variable in session //TODO
//    public double getProgressInPercent(int progress, int sizeOfIrregularVerbs) {
//        double progressInPercent = (progress / sizeOfIrregularVerbs) * 100;
//        log.info("ProgressInPercent: {}", progressInPercent);
//        return progressInPercent;
//    }

}
