package com.xyz;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FetchTest
{
   public static void main(String args[])
   {
	   StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	   
	Transaction t=session.beginTransaction();
	
	
	TypedQuery query=session.createQuery("from Question");
	
	List<Question>list=query.getResultList();
	
	Iterator<Question> iterator=list.iterator();
	
	while(iterator.hasNext())
	{
		Question question=iterator.next();
		System.out.println("QuestionId::"+question.getId());
		System.out.println("QuestionName::"+question.getName());
		System.out.println("QuestionPostedBy::"+question.getUsername());
		
		Map<String,String>map=question.getAnswers();
		Set<Map.Entry<String,String>> set=map.entrySet();
		
		Iterator<Map.Entry<String,String>>iteratoranswer=set.iterator();
		
		while(iteratoranswer.hasNext())
		{
			Map.Entry<String,String>entry=(Map.Entry<String,String>)iteratoranswer.next();
			System.out.println("AnswerName::"+entry.getKey());
			System.out.println("AnswerPosted By::"+entry.getValue());
		}
	}
	session.close();
   }
}
