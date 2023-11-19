package spring_sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tester {
public static void main(String[] args) {
	ClassPathResource resource=new ClassPathResource("/spring_sample/Myconfiguration.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
//	Mobile mobile1=(Mobile) factory.getBean("mobile");
//	System.out.println("mobile1");
//	Mobile mobile2=(Mobile) factory.getBean("mobile");
//	System.out.println("mobile2");
//	Mobile mobile3=(Mobile) factory.getBean("mobile");
//	System.out.println("mobile3");
	
	ApplicationContext context=new ClassPathXmlApplicationContext("/spring_sample/Myconfiguration.xml");
	Mobile mobile=(Mobile) context.getBean("mobile");
	System.out.println(mobile);
	
	
	Laptop laptop=(Laptop) context.getBean("laptop");
	System.out.println(laptop);
	
//	int a=12_00_000;
	
	}
}
