package org.o7planning.tutorial.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.o7planning.tutorial.model.Person;

public interface FormRepository {  
    public void formSave(Person emp);
}
