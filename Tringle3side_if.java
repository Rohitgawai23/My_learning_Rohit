/* 3 If the three sides of a triangle are entered through the keyboard,
write a program to check whether the triangle is valid or not. The
triangle is valid if the sum of two sides is greater than the largest of
the three sides.*/

import java.util.*;
class Tringle3side_if
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of 3 side one by one : ");
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();

if(s1+s2>s3 || s1+s3>s2 || s2+s3>s1)
	System.out.println("It is valid triangle");
else
	System.out.println("It is not valid triangle");


}
}
