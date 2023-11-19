package Mapping;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Pancard c =new Pancard();
		c.setDob(2005);
		c.setName("Bhagya");
		c.setPanno("1wxc43567");
	}
	Person p=new Person();
	
	
	
	
	
	
	
	

	
	
	
	

}
