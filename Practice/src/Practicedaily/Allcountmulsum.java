package Practicedaily;

public class Allcountmulsum {
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		int mul=1;
		for(int i=1; i<=32; i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		for(int i=1; i<=32; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		}
	}
	else
	{
		for(int i=1; i<=32; i++)
		{
			if(i%2==0)
			{
				i++;
			}
	System.out.println(i);
	}

}}
