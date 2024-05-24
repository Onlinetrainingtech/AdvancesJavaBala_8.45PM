package com.xyz.JPABalaHibernate;

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
       
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentPU");
    	EntityManager em=emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	/*StudentEntity s1=new StudentEntity();
    	s1.setS_id(1001);
    	s1.setS_name("mohamed");
    	s1.setS_age(24);
    	
    	StudentEntity s2=new StudentEntity();
    	s2.setS_id(1002);
    	s2.setS_name("azar");
    	s2.setS_age(26);
    	
    	em.persist(s1);
    	em.persist(s2);*/
    	
    	StudentEntity s=em.find(StudentEntity.class,1001);
    	
    	/*System.out.println("StudentId::"+s.getS_id());
    	
    	System.out.println("StudentName::"+s.getS_name());
    	
    	System.out.println("StudentAge::"+s.getS_age());*/
    	
    	em.remove(s);
    	
    	em.getTransaction().commit();
    	
    	emf.close();
    	
    	em.close();
    	
    	/*s.setS_age(100);
    	
    	System.out.println("After Update");
	
    	System.out.println("StudentId::"+s.getS_id());
    	
    	System.out.println("StudentName::"+s.getS_name());
    	
    	System.out.println("StudentAge::"+s.getS_age());
    	*/
    	
    }
}
