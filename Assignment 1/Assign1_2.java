//02.	Write a program that takes radius of a circle as input.
// Read the entered radius using Scanner class. 
//Then calculate and print the area and circumference of the circle.
import java.util.*;
class Assign1_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius :");
		int r = sc.nextInt();
		
		double area;
		double circumference;
		
		area =(2*(3.14)*r);
		circumference=(3.14*r*r);
		
		System.out.println("Area of circle:"+area);
		System.out.println("Circumference of circle :"+circumference);
	}	
}
