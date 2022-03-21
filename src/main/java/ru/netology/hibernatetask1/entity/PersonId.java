package ru.netology.hibernatetask1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}
