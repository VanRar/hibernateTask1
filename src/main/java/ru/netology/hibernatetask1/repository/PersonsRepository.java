package ru.netology.hibernatetask1.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersonsRepository {
    @PersistenceContext
    private EntityManager entityManager;



}
