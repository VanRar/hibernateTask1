package ru.netology.hibernatetask1.Service;

import org.springframework.stereotype.Service;
import ru.netology.hibernatetask1.entity.Persons;
import ru.netology.hibernatetask1.repository.PersonsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonsRepository personsRepository;

    public PersonService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public List<Persons> getPersonsByCity(String city){
        return personsRepository.getPersonsByCity(city);
    }

    public List<Persons> getPersonsByAge(int age){
        return personsRepository.getPersonsByAge(age);
    }

    public List<Persons> findByPersonIdAgeLessThan(int age){
        return personsRepository.findByPersonIdAgeLessThan(age);
    }

    public List<Persons> getPersonsByAgeAndSort(int age){
        return personsRepository.getPersonsByAgeAndSort(age);
    }

    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname){
        return personsRepository.getPersonsByNameAndSurname(name, surname);
    }
}
