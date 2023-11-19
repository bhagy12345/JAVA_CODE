package Hibernate;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Aesprogram {
	@Id
	private String usename;
	private String pwd;
	private String balance;
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String i) {
		this.balance = balance;
	}

		
	}
	


