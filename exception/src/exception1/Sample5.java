package exception1;

public class Sample5 {
	public static void main(String[] args) {
	try {
		int i=1/0;
	}
	catch(ArithmeticException e)
	{
		int[]arr= {10,20,30,40};
		try {
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("handled...");
		}
	}
	}

}
