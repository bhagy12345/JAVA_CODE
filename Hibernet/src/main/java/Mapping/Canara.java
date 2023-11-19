package Mapping;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Canara {
@Id
private String username;
private String pwd;
private double Balance;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public double getBalance() {
	return Balance;
}
public void setBalance(double balance) {
	Balance = balance;
}

}
