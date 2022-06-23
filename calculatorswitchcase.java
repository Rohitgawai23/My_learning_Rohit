import java.util.*;
class calculatorswitchcase
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\t\t\tCalculator");
System.out.println("\t\t\t==========");
System.out.println("\t\t\t+:Add");
System.out.println("\t\t\t-:Sub");
System.out.println("\t\t\t*:multiplication");
System.out.println("\t\t\t/:Division");

System.out.println("\n\t\t\tEnter your choice= ");
char choice=sc.next().charAt(0);

switch(choice)
{
case '+':
		
		System.out.print("\n\t\t\tenter your value= ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.print("\n\t\t\tResult= "+c);
		break;
		

case '-':
		
		System.out.print("\n\t\t\tenter your value= ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int d=x-y;
		System.out.print("\n\t\t\tResult= "+d);
		break;
		

case '*':
		
		System.out.print("\n\t\t\tenter your value= ");
		int r=sc.nextInt();
		int s=sc.nextInt();
		int e=r*s;
		System.out.print("\n\t\t\tResult= "+e);
		break;
		

case '/':
		
		System.out.print("\n\t\t\tenter your value= ");
		int o=sc.nextInt();
		int p=sc.nextInt();
		int f=o/p;
		System.out.print("\n\t\t\tResult= "+f);
		break;
		
}


}
}

























