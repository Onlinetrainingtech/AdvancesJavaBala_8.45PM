package com.xyz.JPARelationShipOnetoOne;

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
        
        Student s1=new Student();
        s1.setS_id(501);
        s1.setS_name("azar");
        
//        Student s2=new Student();
//        s2.setS_id(601);
//        s2.setS_name("mohamed");
        
        
        // Using merge instead of persist
        em.merge(s1);
        //em.merge(s2);
        
        Library lib1=new Library();
        lib1.setB_id(1001);
        lib1.setB_name("DS");
        lib1.setStud(s1);
        
//        Library lib2=new Library();
//        lib2.setB_id(1002);
//        lib2.setB_name("CS");
//        lib2.setStud(s2);
//        
        // Using merge instead of persist
        em.merge(lib1);
        //em.merge(lib2);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
}
