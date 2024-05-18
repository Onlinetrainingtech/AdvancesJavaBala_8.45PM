package com.xyz.JPAHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentCRUD {
	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentPU");
        EntityManager em = emf.createEntityManager();

        // Create
        em.getTransaction().begin();
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        em.persist(student);
        em.getTransaction().commit();

        // Read
        Student foundStudent = em.find(Student.class, student.getId());
        System.out.println("Found Student: " + foundStudent.getName());

        // Update
        em.getTransaction().begin();
        foundStudent.setAge(21);
        em.merge(foundStudent);
        em.getTransaction().commit();

        // Delete
//        em.getTransaction().begin();
//        em.remove(foundStudent);
//        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

