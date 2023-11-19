package Mapping;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Pancard {
@Id
String panno;
String name;
int dob;
public String getPanno() {
	return panno;
}
public void setPanno(String panno) {
	this.panno = panno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDob() {
	return dob;
}
public void setDob(int dob) {
	this.dob = dob;
}
}
