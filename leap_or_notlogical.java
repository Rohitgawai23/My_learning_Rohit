/* (1) Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical operators
&& and ||. */


import java.util.*;
class leap_or_notlogical
{
public static void main(String []args)
{
int year;
Scanner sc = new Scanner(System.in);
System.out.println("\n\t\tenter the leapyear");
year=sc.nextInt();
if((year%4==0 || year%400==0) && year%1==0)
{
System.out.print("\n\t\tThis is Leapyear ");
}
else
{
System.out.print("\n\t\tThis is not Leapyear");
}
}
}