// 8. Write a Java program to calculate profit or loss.


import java.util.*;
class ProfitLoss1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("\t\t\tEnter Cost Price : ");
		double cp = sc.nextDouble();
		System.out.print("\t\t\tEnter Selling Price : ");
		double sp = sc.nextDouble();
		
		double pl = sp-cp;

		if(pl>0)
		{
			System.out.print("\t\t\tYour profit amount is : " +pl);
		}
			else
				System.out.print("\t\t\tYour loss amount is : " +pl);

	}
}