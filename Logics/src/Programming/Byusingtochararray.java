package Programming;

public class Byusingtochararray {
static void distinctCharacter(char[]input)
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
	String str="Programming";
	//converting String to array by using tochar array
	char[] ch=str.toCharArray();
	distinctCharacter(ch);
		}
}
	
		