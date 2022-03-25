package ru.netology.hibernatetask1.repository;

import org.springframework.stereotype.Repository;
import ru.netology.hibernatetask1.entity.Persons;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonsRepository {
    private final FindPersonsJpaRepository findPersonsJpaRepository;

    public PersonsRepository(FindPersonsJpaRepository findPersonsJpaRepository) {
        this.findPersonsJpaRepository = findPersonsJpaRepository;
    }

    public List<Persons> getPersonsByCity(String city){
        return findPersonsJpaRepository.findByCityOfLiving(city);
    }

    public List<Persons> getPersonsByAge(int age){
        return findPersonsJpaRepository.findByPersonId_Age(age);
    }

    public List<Persons> findByPersonIdAgeLessThan(int age){
        return findPersonsJpaRepository.findByPersonIdAgeLessThan(age);
    }

    public List<Persons> getPersonsByAgeAndSort(int age){
        return findPersonsJpaRepository.findPersonsByPersonId_AgeAfterAndOrderByPersonId_Age(age);
    }

    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname){
        return findPersonsJpaRepository.findByPersonId_NameAndPersonId_Surname(name, surname);
    }


}