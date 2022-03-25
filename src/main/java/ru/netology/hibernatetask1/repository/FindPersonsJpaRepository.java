package ru.netology.hibernatetask1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.hibernatetask1.entity.PersonId;
import ru.netology.hibernatetask1.entity.Persons;

import java.util.List;
import java.util.Optional;

public interface FindPersonsJpaRepository extends JpaRepository<Persons, PersonId> {

    List<Persons> findByCityOfLiving(String city);
    List<Persons> findByPersonId_Age(int age);
    List<Persons> findByPersonIdAgeLessThan(int age);
    List<Persons> findPersonsByPersonId_AgeAfterAndOrderByPersonId_Age(int age);
    Optional<Persons> findByPersonId_NameAndPersonId_Surname(String name, String surname);


}
