package com.plewa.irregular_verbs.repository;

import com.plewa.irregular_verbs.entity.Thing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingRepository extends JpaRepository<Thing, Long> {

    Thing findThingById(Long id);

}
