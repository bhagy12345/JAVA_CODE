package exception1;

public class Sample4 {
	public static void main(String[] args) throws ArithmeticException {
		try {
			int i=1/0;
		}
		catch(Exception e)
		{
			System.out.println("handled...");
		}
	}
	
}

