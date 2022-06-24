// 2: find the sum of a number 34567834;
class Sumnumber
{
	public static void main(String []args)
	{
		long n=34567834;
		long i,rem,sum= 0L;
		i=n;  // initilization
		
	while(i!=0)
	{
	rem=i%10;
		sum=sum+rem;
	i=i/10;
	}
	System.out.println("\t\t\tsum of number is="+sum);
}
}
