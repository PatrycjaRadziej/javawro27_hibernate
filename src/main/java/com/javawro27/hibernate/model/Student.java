package com.javawro27.hibernate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity //jest to klasa bazodanowa (Uwaga! nie zapomnij o pliku cfg.xml)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //identity - identyfikator pochodzi z bazy danych
    //sequence - licznik identyfikatorów pochodzi z hibernate, wszystkie klasy posiadają wspólny licznik
    //table - licznik identyfikatorów pochodzi z hibernate i posiada oddzielny dla każdej tabeli
    private Long id;

    private String firstName;
    private String lastName;
    private double height;
    private int age;
    private boolean alive; // nie isAlive

    private Behaviour behaviour;

}






