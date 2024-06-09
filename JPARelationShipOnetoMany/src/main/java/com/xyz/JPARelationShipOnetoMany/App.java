package com.xyz.JPARelationShipOnetoMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Collection_Type");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Student student = new Student();
        student.setName("Mohamed");
        
        LibraryBook book1=new LibraryBook();
        book1.setTitle("DS");
        
        LibraryBook book2=new LibraryBook();
        book2.setTitle("CS");
        
        //Add book to the student
        
        student.addLibraryBook(book1);
        
        student.addLibraryBook(book2);
        
        em.persist(student);
        
        em.getTransaction().commit();
        
        Student fetchedStudent=em.find(Student.class,student.getId());
        
        System.out.println("StudentName::"+fetchedStudent.getName());
        
        for(LibraryBook book:fetchedStudent.getLibraryBooks()) {
        	System.out.println("Lib book title::"+book.getTitle());
        }
        em.close();
        
        emf.close();
    }
}
