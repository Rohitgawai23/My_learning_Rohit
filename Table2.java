/* WAP input anumber and print the table it
2 X 1 =2
2 x 2 =4
*/
 
import java.util.*;
class Table2
{
	public static void main(String []args)
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t\t\tEnter any number for multiplication : ");
			int n = sc.nextInt();
		int m = 1;

		while(m<=10)
		{	
			int t = n*m;
			System.out.println("\t\t\t" +n+" X " +m+ " = " +t);
			
		   m++;
		}
	}
}
