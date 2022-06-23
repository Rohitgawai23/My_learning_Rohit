import java.util.*;
class calculator
{
public static void main(String []args)
{
Scanner sc= new Scanner(System.in);
System.out.println("\t\t\tCalculator");
System.out.println("\t\t\t==========");

System.out.println("\t\t\t1:ADD");
System.out.println("\t\t\t2:SUB");
System.out.println("\t\t\t3:MULTI");
System.out.println("\t\t\t4:DIV");

System.out.print("\n\t\t\tEnter your choice= ");
int choice=sc.nextInt();

if(choice==1)
		{	
		System.out.print("\n\t\t\tenter your value= ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.print("\n\t\t\tresult= "+c);
		}

if(choice==2)
		{	
		System.out.print("\t\t\tenter your value= ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int d=a-b;
		System.out.print("\n\t\t\tresult= "+d);
		}


if(choice==3)
		{	
		System.out.print("\n\t\t\tenter your value= ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double e=a*b;
		System.out.print("\n\t\t\tresult= "+e);
		}

if(choice==4)
		{	
		System.out.print("\n\t\t\tenter your value= ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double f=a/b;
		System.out.print("\n\t\t\tresult= "+f);
		}


}
}