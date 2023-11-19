package Hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) throws Exception {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		Employe emp=new Employe();
		emp.setEid(10);
		emp.setEname("Shree");
		FileInputStream f =new FileInputStream("C:\\Users\\sachi\\Downloads\\Shreeleela.jpg");
		byte[] b=new byte[f.available()];
		f.read(b);
		emp.setImage(b);
		t.begin();
		m.persist(emp);
		t.commit();
		
	}
}
