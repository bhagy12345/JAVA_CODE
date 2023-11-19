package Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Aes11 {

	private static EntityManager m;

	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
//		Aesprogram a=new Aesprogram();
//		a.setUsename("Akhi");
//		a.setPwd(AES.encrypt("Akhi123", "Beauty"));
//		a.setBalance(5600);
//		t.begin();
//		m.persist(a);
//		t.commit();
//		
		Aesprogram a=m.find(Aesprogram.class,"mala");
		System.out.println("usename :"+a.getUsename());
		System.out.println("pwd :"+a.getPwd());
		System.out.println("Balance :"+a.getBalance());
	}

	public static String encrypt(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}

