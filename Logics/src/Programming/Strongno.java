package Programming;

import java.util.Scanner;

public class Strongno {
private static Object sum;
public static void main(String[] args, Object copy) {
	Scanner sc = new Scanner(System.in);
	{
			int num=sc.nextInt(),copy1=num,sum=0,fact;
			while(num!=0) {
				int rem=num%10;
				sum=sum+fact(rem);
				num=num/10;
			}
		}
	if(sum==copy)
	 	{
				System.out.println(copy +"is a strong number");
	 	}
}
private static int fact(int rem) {
	  int fact=1;
		for(int i=rem; i>=1; i--) {
			fact=fact*i;
	}
		return fact;
	}

}
