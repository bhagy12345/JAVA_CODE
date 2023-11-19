package Revision;
public class Strong {
public static void main(String[] args) {
	int no=190;
	int fact=1;
	int sum=0;
	int copy=no;
	while(no!=0)
	{
	int rem=no%10;
	for(int i=rem; i<no; i++)
	{
		fact=fact*i;
	}
	sum=sum+fact;
	no=no/10;
	}
  if(copy==sum)
{
	System.out.println("Strong Number");
}else
	System.out.println("Not a Strong Number");
}
}




