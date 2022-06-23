/* (6) Using conditional operators determine:
(1) Whether the character entered through the keyboard is a
lower case alphabet or not.
(2) Whether a character entered through the keyboard is a special
symbol or not.*/

import java.util.*;
class conditional_oper
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
 System.out.println("Enter any character : ");
 char ch = sc.next().charAt(0);

if(ch>='a' && ch<='z')
	System.out.println("Entered character is lower case");

else if(ch>='A' && ch<='Z')
	System.out.println("Entered character is not lower case");
else if((ch>=0 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96))
	System.out.println("Enter character is symbol.");
}
}