package ru.netology.hibernatetask1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Persons")
public class Person {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;

    private String phoneNumber;
    private String cityOfLiving;
}
