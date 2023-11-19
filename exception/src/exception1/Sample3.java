package exception1;

public class Sample3 {
	public static void main(String[] args) {
		try {
			int i=1/0;
		}
		catch(Exception e)
		{
			System.out.println("handled....");
		}
	}

}
