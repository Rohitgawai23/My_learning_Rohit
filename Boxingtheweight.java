/* (5) In boxing the weight class of a boxer is decided as per the following
table. Write a program that receives weight as input and prints out
the boxer’s weight class.
Boxer Class  Weight in Pounds  
Flyweight    < 115
Bantamweight  115 - 121
Featherweight  122 - 153
Middleweight  154 – 189
Heavyweight    >= 190 */

import java.util.*;
class Boxingtheweight
{
public static void main(String []args)
{
Scanner sc= new Scanner(System.in);
System.out.println("boxing the weight class of a boxer ");
int w= sc.nextInt();
if(w < 115){
	System.out.println("Flyweight.");
	}
	else if(w >= 115 && w <= 121)
	{
	System.out.println("Bantamweight.");
	}
	else if(w >= 122 && w <= 153)
	{
	System.out.println("Featherweight.");
	}
	else if(w >= 154 && w <= 189)
	{
	System.out.println("Middleweight.");
	}
	else{
	System.out.println("Heavyweight.");
	}
}
}