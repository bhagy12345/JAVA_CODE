package collection;

import java.util.ArrayList;

public class Remove {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add("Banglore");
	l1.add("Nelmangala");
	l1.add("Rajajinagar");
	System.out.println("l1->"+l1);
	l1.remove("Rajajinagar");
	System.out.println("l2->"+l1);
	l1.remove(0);
	System.out.println("l3->"+l1);
	}
}
