package collection;

import java.util.ArrayList;

public class addAll {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	ArrayList l2=new ArrayList();
	l2.add('A');
	l2.add('B');
	l2.add('C');
	System.out.println(".....A....");
	System.out.println("l1->"+l1);
	System.out.println("l2->"+l2);
	l1.addAll(l2);
	System.out.println(".....B....");
	System.out.println("l1->"+l1);
	System.out.println("l2->"+l2);
	
	
	
}
}
