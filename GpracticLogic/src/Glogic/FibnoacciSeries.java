package Glogic;

import java.util.Scanner;
public class FibnoacciSeries {
public static void main(String[] args) {
Scanner sc=new 	Scanner(System.in);
int number=sc.nextInt();
System.out.println("Enter number");
int n1=0;
int n2=1;
for(int i=3; i<=number; i++)
{
	int n3=n1+n2;
	n1=n2;
	n2=n3;
}
}
}
