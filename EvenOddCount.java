/* 2: WAP find the difference between even and odd number  from 201 to 400;
    Total Even Number :
    Total Odd Number :
     Difference 
    Count of Even Number  :
    Count of Odd Number:
*/

class EvenOddCount
{
	public static void main(String []args)
	{
	int n = 201;
	int count = 0;
	int flag = 0;
	int sum = 0;
	int s =0;
    
	while(n<=400)
		{
			if(n%2==0)
			{
				sum = sum + n;
				count++;
			}
			else
			{
				s = s + n;
				flag++;
		}

		   n++;
		}
		 	System.out.println("\t\t\tTotal Even Number = "+sum);
			System.out.println("\t\t\tTotal Odd Number = "+s);
			int diff = sum-s;
			System.out.println("\t\t\tDifference = "+diff);
			System.out.println("\t\t\tTotal Even Number = "+count);
			System.out.println("\t\t\tTotal Odd Number = "+flag);
	}

}


