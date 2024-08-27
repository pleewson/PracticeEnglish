package com.plewa.irregular_verbs.service;

import com.plewa.irregular_verbs.entity.IrregularVerb;
import com.plewa.irregular_verbs.repository.IrregularVerbRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IrregularVerbService {
    private IrregularVerbRepository irregularVerbRepository;

    public IrregularVerbService(IrregularVerbRepository irregularVerbRepository) {
        this.irregularVerbRepository = irregularVerbRepository;
    }

    public List<IrregularVerb> findAll(){
        return irregularVerbRepository.findAll();
    }

}
