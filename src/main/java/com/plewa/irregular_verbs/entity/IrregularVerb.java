package com.plewa.irregular_verbs.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "irregular_verbs")
public class IrregularVerb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String verb1;
    @Column(nullable = false)
    String verb2;
    @Column(nullable = false)
    String verb3;
    @Column(name = "verb_in_polish")
    String verbInPolish;

}
