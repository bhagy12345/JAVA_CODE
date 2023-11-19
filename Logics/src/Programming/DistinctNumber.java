package Programming;

public class DistinctNumber {
static void distinctNumber(int[]input)
	{
		for(int i=0; i<input.length; i++)
		{
			int answer=0;
			for(int j=0; j<input.length; j++)
			{
			if(i!=j && input[i]==input [j])
{
	answer++;
	break;
}
			
			}
			if(answer==0)
			{
				System.out.print(input[i]);
			}
		}
	}
	
		public static void main(String[] args) {
	int[] arr= {1,2,2,3,4,4,5,6,7,7,8};
	//converting String to array by using array
	int[] ch=arr;
	distinctNumber(ch);
		}
}
	
		