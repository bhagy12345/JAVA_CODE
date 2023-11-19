package DataStructure;
public class PrintArrayElement {
	public void printArray(int[] arr)
	{
		int n=arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}
public static void main(String[] args) {
	PrintArrayElement p= new PrintArrayElement();
	p.printArray(new int[] {5, 1, 9, 2, 10});
   }
}
