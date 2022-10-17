
//03.	Write a program to calculate sum of 5 subject’s marks & find percentage.
// Take the obtained marks from user using Scanner class. 
// Output should be in this format [ percentage marks = 99 % ]. 
//Use concatenation operator here.
import java.util.*;
class Assign1_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter maths mark out of 100:");
        int m=sc.nextInt();
        
        System.out.println("Enter Science mark out of 100:");
        int s=sc.nextInt();

		System.out.println("Enter Geography mark out of 100:");
		int g=sc.nextInt();
		
		System.out.println("Enter Marathi mark out of 100:");
		int ma=sc.nextInt();
		
		System.out.println("Enter Hindi mark out of 100:");
		int h=sc.nextInt();
		
		double sum = (m+s+g+ma+h);
		
		double perc = ((sum/500)*100);
		
		System.out.println("percentage marks = "+perc+" %");
	}
}	
		