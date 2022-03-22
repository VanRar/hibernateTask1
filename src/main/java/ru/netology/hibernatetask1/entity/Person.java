package ru.netology.hibernatetask1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "persons")
public class Person {

    @EmbeddedId
    private PersonId personId;

    private String phoneNumber;
    private String cityOfLiving;
}
