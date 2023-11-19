package exception1;

public class Sample2 {
	public static void main(String[] args) {
		System.out.println("****main starts****");
		try {
			int i=8;
			int[] arr= {10,20,30,4,5};
			try {
		System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("cought");
			}
		}	
			
		catch(ArithmeticException e) {
			System.out.println("handled....");
		}
		System.out.println("****main ends****");
	}
}
