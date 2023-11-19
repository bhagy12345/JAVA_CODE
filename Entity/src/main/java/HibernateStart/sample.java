package HibernateStart;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class sample{
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
		Employe emp=new Employe();
		emp.setEid(3);
		emp.setEname("Bhagya");
		emp.setEsal(2500.0);
		t.begin();
		m.persist(emp);
		t.commit();
	}
}
