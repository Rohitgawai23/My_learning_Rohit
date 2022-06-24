// 3: In the above Question find the sum of Even and Odd Numbers

class Sumevenodd
{
	public static void main(String rgs[])
     {
		int n = 34567834, i, rem, sum = 0, s = 0;
		i=n;//initilization

          while(i!=0)
		{
             rem=i%10;
			
		    if(rem%2==0)
                     sum = sum+rem;
		else
		   s = s+rem;
		    i=i/10;

          }
			System.out.println("\t\t\tSum of even number is : " +sum);
			System.out.println("\t\t\tSum of odd number is : " +s);
	}
}