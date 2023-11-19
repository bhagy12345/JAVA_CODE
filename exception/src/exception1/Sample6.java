package exception1;

public class Sample6 {
	public static void main(String[] args) {
		try {
			int i=1/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("cought..");
		}
		finally {
			System.out.println("i am finally block...");
		}
	}

}
