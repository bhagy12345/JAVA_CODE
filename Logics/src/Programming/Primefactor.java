package Programming;

import java.util.Scanner;
public class Primefactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number...");
		int num=sc.nextInt();
		for(int i=2; i<=num/2; i++);{
			if(num%num == 0 && prime(num))
				System.out.println(num+" prime factor");
		}
	}
	private static boolean prime(int num) {
		{
		for(int i=2; i<=num/2; i++)
		{	
			if(num%i==0)
				return false;
		}
		return true;
		}
		}
}

