package ru.netology.hibernatetask1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.netology.hibernatetask1.Service.PersonService;
import ru.netology.hibernatetask1.entity.Persons;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class PersonsController {
    private final PersonService personService;

    public PersonsController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam("city") String city) {
        return personService.getPersonsByCity(city);
    }


    @GetMapping("/persons/by-age")
    public List<Persons> getPersonsByAge(@RequestParam("age") int age) {
        return personService.findByPersonIdAgeLessThan(age);
    }


    @GetMapping("/persons/by-name-surname")
    public Optional<Persons> getPersonsByNameAndSurname(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return personService.getPersonsByNameAndSurname(name, surname);
    }
}
