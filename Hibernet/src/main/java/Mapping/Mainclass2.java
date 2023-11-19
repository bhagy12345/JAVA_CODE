package Mapping;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Mainclass2 {
	public static void main(String[] args) { 
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Canara c=new Canara();
		c.setUsername("Susheela");
		c.setPwd(AES.encrypt("Bhagya7895","me"));
		c.setBalance(5600);
		t.begin();
		m.persist(c);
		t.commit();
   }
}
