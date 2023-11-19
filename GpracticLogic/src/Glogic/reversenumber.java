package Glogic;

public class reversenumber {
public static void main(String[] args) {
	int[]arr= {798,876,654,438,853};
for(int i=0; i<arr.length; i++)
	{
	int rem=0;
	int co=0;
	while(arr[i] !=0)

	{
		rem=arr[i]%10;
		co=arr[i]/10;
		co=numRevrse(co);
		arr[i] *=0;
		}
	System.out.println(co + "" + rem + "");
}
}
static int numRevrse(int no)
{
	int reverse=0;
	while(no!=0);
	{
		int rem=no%10;
		reverse=(reverse *10)+rem;
		no /=10;
		
	}
return reverse;
}
}

