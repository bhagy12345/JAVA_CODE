package shutdown1;
import java.io.IOException;
import java.util.Scanner;


public class Demo {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the time limit in seconds");
	int second=sc.nextInt();
	Runtime r1=Runtime.getRuntime();
	System.out.println("Pc will shoutdown within"+second+"second");
	try {
		r1.exec("shutdown -s -t "+second);
		}catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
