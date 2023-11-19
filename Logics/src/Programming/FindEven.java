package Programming;

public class FindEven {
public static void FindEvenNumber(int start,int end)
{
	if(start<=end)
	{
		if(start%2==0)
		{
			System.out.println(start);
		}
		FindEvenNumber(start+1,end);
		}
}
public static void main(String[] args) {
	FindEvenNumber(0,6);
}
}
