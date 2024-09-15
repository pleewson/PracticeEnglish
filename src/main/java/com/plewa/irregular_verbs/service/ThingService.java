package com.plewa.irregular_verbs.service;

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

    public List<Thing> getAllThingsByCategory(String categoryName){
        List<Thing> allThings = thingRepository.findAllByCategoryName(categoryName);
        return allThings;
    }

    public Thing getOneRandomThingFromList(List<Thing> things) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(things.size());
        return things.get(randomNumber);
    }


}
