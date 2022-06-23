/* 9 Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/ 


import java.util.*;
class Gradesystem
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks");
int p = sc.nextInt();
    if(x>=90)&&(x<=100){
      System.out.println("your grading is : A");
    	}
    else if((x>=90)&&(x<80))
	{
      System.out.println("your grading is : B");
    	}
    else if((x>=80)&&(x<70))
	{
      System.out.println("your grading is : C");
    	}
    else if((x>=70)&&(x<60))
	{
      System.out.println("your grading is : D");
    	}
    else if((x>=60)&&(x<40))
	{
      System.out.println("your grading is : E");
    	}
    else if(x<40)
	{
      System.out.println("your grading is : F");
    	}
    else{
      System.out.println("Your marks is not correct ");
    }
}

}