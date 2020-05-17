package com.javawro27.hibernate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity //jest to klasa bazodanowa (Uwaga! nie zapomnij o pliku cfg.xml)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private double height;
    private int age;
    private boolean alive; // nie isAlive

}






