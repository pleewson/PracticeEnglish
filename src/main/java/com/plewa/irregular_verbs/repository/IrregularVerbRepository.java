package com.plewa.irregular_verbs.repository;

import com.plewa.irregular_verbs.entity.IrregularVerb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IrregularVerbRepository extends JpaRepository<IrregularVerb, Long> {
    List<IrregularVerb> findAll();
}
