package com.plewa.irregular_verbs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "thing")
@NoArgsConstructor
@Getter
public class Thing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String englishName;
    String polishName;
    String src;
    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;
}
