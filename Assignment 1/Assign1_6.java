//06.	Write a program to convert temperature from Fahrenheit to Celsius. 
//Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
import java.util.*;
class Assign1_6
{
	public static void main(String args[])
	{
		float f,cel;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temprature in fahrenheit :");
        f=sc.nextFloat();
		
		cel=((5*(f-32)/9)); 
		System.out.println("Temprature in degree Celsius : "+cel+" °C");
		
	}

}