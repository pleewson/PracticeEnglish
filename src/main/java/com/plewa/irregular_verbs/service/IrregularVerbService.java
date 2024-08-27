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


    private Set<Integer> setSetWithUniqueNumbers(int limit) {
        List<IrregularVerb> irregularVerbs = irregularVerbRepository.findAll();
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        Random rnd = new Random();

        while (uniqueNumbers.size() < limit) {
            int randomNumber = rnd.nextInt(irregularVerbs.size());
            uniqueNumbers.add(randomNumber);
        }

        return uniqueNumbers;
    }


    private List<IrregularVerb> getUniqueVerbsList(Set<Integer> uniqueNumbers) {
        List<IrregularVerb> allIrregularVerbs = irregularVerbRepository.findAll();
        List<IrregularVerb> uniqueVerbs = new ArrayList<>();

        for (Integer randomNumber : uniqueNumbers) {
            uniqueVerbs.add(allIrregularVerbs.get(randomNumber));
        }

        return uniqueVerbs;
    }


    public boolean checkIfProgressIs100(int progress, int sizeOfIrregularVerbs) {
        double progressInPercent = getProgressInPercent(progress, sizeOfIrregularVerbs); //TODO think about this
        if (progressInPercent == 100d) {
            return true;
        }
        return false;
    }

    //set progress variable in session //TODO
    public double getProgressInPercent(int progress, int sizeOfIrregularVerbs) {
        double progressInPercent = (progress / sizeOfIrregularVerbs) * 100;
        log.info("ProgressInPercent: {}", progressInPercent);
        return progressInPercent;
    }

}
