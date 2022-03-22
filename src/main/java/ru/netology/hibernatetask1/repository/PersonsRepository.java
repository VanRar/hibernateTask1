package ru.netology.hibernatetask1.repository;

import org.springframework.stereotype.Repository;
import ru.netology.hibernatetask1.entity.Persons;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String city){
        Query query = entityManager.createQuery("SELECT p FROM Persons p where p.cityOfLiving = :city", Persons.class);
        query.setParameter("city", city);
        var result = query.getResultList();
        //result.forEach(System.out::println);

        return result;

    }
}