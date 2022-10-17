//04.	Write a program to find the simple interest. 
//Take the principle amount, rate of interest 
//and time from user using Scanner class.
import java.util.*;
class Assign1_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal Ammount:");
        double a=sc.nextDouble();
		System.out.println();
		System.out.println("Enter rate:");
		double r=sc.nextDouble();
		System.out.println();
		System.out.println("Enter time in years:");
		double t=sc.nextDouble();
		System.out.println();
		double si=((a*r*t)/(100));
		System.out.println("Simple interest: "+si);
	}
}	
