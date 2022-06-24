// 1: WAP Input a number and separate it.

import java.util.*;
class Sep_number
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\t\t\tEnter number=");
		int n=sc.nextInt();

		int i,rem;
		
		i=n;  //initilization
		while(i!=0)
		{
			rem=i%10;
			
			System.out.print("\t"+rem+" ");
		     i=i/10;
		}
	}	
}





