package ru.netology.hibernatetask1.Service;

import org.springframework.stereotype.Service;
import ru.netology.hibernatetask1.entity.Persons;
import ru.netology.hibernatetask1.repository.PersonsRepository;

import java.util.List;

@Service
public class PersonService {
    private final PersonsRepository personsRepository;

    public PersonService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public List<Persons> getPersonsByCity(String city){
        return personsRepository.getPersonsByCity(city);
    }
}
