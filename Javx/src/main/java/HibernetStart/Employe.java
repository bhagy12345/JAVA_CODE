package HibernetStart;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employe {
	@Id
private int eid;
private String  ename;
private double esal;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}

	
}