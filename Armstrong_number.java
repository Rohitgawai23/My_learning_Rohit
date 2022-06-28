import java.util.*;
class Armstrong_number
{
	public static void main(String []args)
	{
		int n,i,arm=0,rem;
		System.out.println("Enter the number")	;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		i=n;
		while(n!=0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(n==arm)
			{
			System.out.println("Armstrong number");
			}
		else
			{
			System.out.println("Not Armstrong number");
			}

	}
}