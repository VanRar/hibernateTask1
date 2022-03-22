package ru.netology.hibernatetask1.repository;

import org.springframework.stereotype.Repository;
import ru.netology.hibernatetask1.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city){
        Query query = entityManager.createQuery("SELECT * FROM netology.persons where city_of_living = 'MOSCOW'", Person.class);
        query.setParameter("city", city);
        var result = query.getResultList();

        return result;

    }
}