package Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Title {
	public static void main(String[] args) {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		SUK s=new SUK();
		s.setAge(10);
		s.setName("Bhagya");
     	t.begin();
		m.persist(s);
        t.commit();


    SUK S = m.find(SUK.class,10);
     System.out.println(s);
     
     SUK S1 = m.find(SUK.class,10);
     t.begin();
     m.remove(s);
     t.commit();
     }
}

