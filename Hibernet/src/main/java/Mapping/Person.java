package Mapping;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Person {
@Id
String name;
int age;
char gender;
//@OneToOne
Pancard a;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public Pancard getA() {
	return a;
}
public void setA(Pancard a) {
	this.a = a;
}



}
