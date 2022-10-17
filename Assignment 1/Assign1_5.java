//05.	Write a program to read the days (eg. 670 days) as 
//integer value using Scanner class.Now convert the entered days 
//into complete years, months and days and print them.
import java.util.*;
class Assign1_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter DAYS :");
        int d=sc.nextInt();
		
		int c=0;
		int ct=0;
		int rem=d;
		int day=0;
		
		while(d>=365)
		{
			c++;
			d=(d-365);
			rem=d;
			
		}
		
		while(rem>=30)
		{
			ct++;
			rem=(rem-30);
			day=rem;
		}	
		if(d<30)
		{
			day=d;
		}
		
		
		System.out.println("year= "+c+" "+"month= "+ct+" "+"day= "+day);
		
	}
}	