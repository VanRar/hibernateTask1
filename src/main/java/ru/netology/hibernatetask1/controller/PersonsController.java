package ru.netology.hibernatetask1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.netology.hibernatetask1.Service.PersonService;
import ru.netology.hibernatetask1.entity.Persons;

import java.util.List;

@Controller
@RequestMapping("/")
public class PersonsController {
    private final PersonService personService;

    public PersonsController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam("city") String city){
        return personService.getPersonsByCity(city);

    }
}
