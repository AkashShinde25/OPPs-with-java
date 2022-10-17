//07.	Write a program to swap two numbers without using third variable.

import java.util.*;
class Assign1_7
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. :");
		a=sc.nextInt();
		System.out.println("Enter 2st no. :");
		b=sc.nextInt();
		
		System.out.println("Before swap 1st no. :"+a);
		System.out.println("Before swap 2nd no. :"+b);
		
		a=(a+b);//25+10=35
		b=a-b;  //35-10=25
		a=a-b;  //35-25=10
		
		System.out.println("After swap 1st no. :"+a);
		System.out.println("After swap 2nd no. :"+b);

	}
}		