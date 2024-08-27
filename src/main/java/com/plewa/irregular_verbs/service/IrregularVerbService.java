package com.plewa.irregular_verbs.service;

import com.plewa.irregular_verbs.entity.IrregularVerb;
import com.plewa.irregular_verbs.repository.IrregularVerbRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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

    public static void getProgressInPercent(int progress, int sizeOfIrregularVerbs) {
        double progressInPercent = (progress / sizeOfIrregularVerbs) * 100;
        log.info("ProgressInPercent: {}", progressInPercent);
    }

}
