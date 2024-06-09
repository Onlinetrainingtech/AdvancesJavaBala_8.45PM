package com.xyz.JPARelationShipOnetoOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Collection_Type");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Student student = new Student();
        student.setName("Mohamed");

        LibraryCard libraryCard = new LibraryCard();
        libraryCard.setCardNumber("LC123457");

        // Set the bidirectional relationship
        student.setLibraryCard(libraryCard);
        libraryCard.setStudent(student);

        // Persist the student (this will also persist the library card because of CascadeType.ALL)
        em.persist(student);
        
        em.getTransaction().commit();
        
        // Fetching the student to verify
        Student fetchedStudent = em.find(Student.class, student.getId());
        System.out.println("Student Name: " + fetchedStudent.getName());
        System.out.println("Library Card Number: " + fetchedStudent.getLibraryCard().getCardNumber());

        em.close();
        emf.close();
    }
}