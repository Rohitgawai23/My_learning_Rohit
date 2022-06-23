/*Q11.
Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/


import java.util.*;

class Electricity
 {
  
 	public static void main(String[]args)
	{
 
 		 Scanner sc=new Scanner(System.in);
 
		 System.out.println("Enter Electricity Units : ");
			double u=sc.nextDouble();

			if(u<=50)
			{
			  double t = u*0.50;
			  System.out.println("Your total electricity bill is : " +t);
			}
				else if(u<=100)
				{
					double t = u*0.75;
			  		System.out.println("Your total electricity bill is : " +t);
			      }
					else if(u<=200)
					{
			 	         double t = u*1.20;
			               System.out.println("Your total electricity bill is : " +t);
			            }
						else if(u>250)
						{
			 	                double t = u*1.50;
    						    double su = t*0.2;
						    double a = t+su;
			                      System.out.println("Your total electricity bill is : " +a);
			            }
						
							
        }
}