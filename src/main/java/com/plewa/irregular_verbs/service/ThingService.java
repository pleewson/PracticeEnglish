package com.plewa.irregular_verbs.service;

import com.plewa.irregular_verbs.entity.IrregularVerb;
import com.plewa.irregular_verbs.entity.Thing;
import com.plewa.irregular_verbs.repository.ThingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ThingService {
    private ThingRepository thingRepository;
    public ThingService(ThingRepository thingRepository){
        this.thingRepository = thingRepository;
    }

    public List<Thing> getAllAnimals(){
        List<Thing> animals = thingRepository.findAllByCategoryName("animal");
        return animals;
    }

    public Thing getOneRandomThingFromList(List<Thing> things) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(things.size());
        return things.get(randomNumber);
    }


}
