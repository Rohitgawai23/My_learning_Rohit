/* 3:WAP  calculate simple interest for 3 years , Amount rate and time inputted by user.

       Year :1 
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)


         Year : 2
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)


            Year :3 
                     
                     Amount=
                    Rate=
                   Interest:
                 Total Payable Amount=( Amunt+ Interest)
*/

class Simple_Intrest
{
	public static void main(String [] arga)
	{
	Scanner sc=new Scanner(System.in);
	double A,R;
	System.out.println("Enter the Amount");
	 A=sc.nextDouble();
	System.out.println("Enter the Rate");
	 A=sc.nextDouble();

	int i=1;
	    while(i<=3)
		{
		if(i==1)
		    {
			System.out.println("year+1");
			double SI=(A*R*1)/100;
			System.out.println("principal amount is="+A);
			System.out.println("Rate of intrest is="+R);
			System.out.println("Intrest amount is="+SI);
			double T=SI+A;
			System.out.println("Total payble amount is="+T);
		    }
		
	else(i==2)
		    {
			System.out.println("year+1");
			double SI=(A*R*2)/100;
			System.out.println("principal amount is="+A);
			System.out.println("Rate of intrest is="+R);
			System.out.println("Intrest amount is="+SI);
			double T=SI+A;
			System.out.println("Total payble amount is="+T);
		    }
		
	else(i==3)
		    {
			System.out.println("year+1");
			double SI=(A*R*3)/100;
			System.out.println("principal amount is="+A);
			System.out.println("Rate of intrest is="+R);
			System.out.println("Intrest amount is="+SI);
			double T=SI+A;
			System.out.println("Total payble amount is="+T);
		    }
		
			i++;
		}

	}
}
























	




































	}

}

