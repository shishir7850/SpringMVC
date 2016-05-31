package org.o7planning.tutorial.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.o7planning.tutorial.model.Person;

public class FormRepositoryimpl implements FormRepository {
	static EntityManager em;
	public void formSave(Person emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        em = emf.createEntityManager();
        System.out.println("FormSave");
        createEmployee(emp);        
	}
	
	private static void createEmployee(Person emp) {
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        System.out.println("added");
 }

}
