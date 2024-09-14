package com.plewa.irregular_verbs.repository;

import com.plewa.irregular_verbs.entity.Thing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThingRepository extends JpaRepository<Thing, Long> {

    Thing findThingById(Long id);

    List<Thing> findAllByCategoryName(String categoryName);


}
