package com.xyz.DSimpleEntityExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPU");
        EntityManager em = emf.createEntityManager();

        // Create
        em.getTransaction().begin();
        StudentEntity student = new StudentEntity();
        student.setS_id(101);
        student.setS_name("azar");
        student.setS_age(24);
        em.persist(student);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
}
}
