/* (2) Any character is entered through the keyboard, write a program to
determine whether the character entered is a capital letter, a small
case letter, a digit or a special symbol.
The following table shows the range of ASCII values for various
characters:
Characters   ASCII Values
A – Z      65 – 90
a – z      97 – 122
0 – 9     58 - 64
special symbols  */

import java.util.*;
class Checkchar_ASCII
{
public static void main(String []args)
{
Scanner sc= new Scanner(System.in);
char n;
System.out.println("Enter your any charactor");
n=sc.next().charAt(0);

if(n>=65 && n<=90 || n>=97 && n<=122)
	System.out.println("character is an alphabet");
else if(n>=48 && n<=57)
	System.out.println("Character is  a digit");
else
	System.out.println("it is Speacial character. ");

}
}



