package Hibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hiber {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
        System.out.println("done");
	}
}
