//08.In a company an employee is paid as under: 
//If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary 
//and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000,
//then HRA = Rs. 2000 and DA = 98% of basic salary. 
//If the employee's salary is input by the user write a program to
//find his gross salary. [ formula : GS= Basic + DA + HRA ]
import java.util.*;
class Assign1_8
{
	public static void main(String args[])
	{
		double bs;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Salary :");
		bs=sc.nextDouble();
		
		double HRA=0;
		double DA=0;
		double GS=0;
		
		if(bs<10000)
		{
			HRA=((bs/100)*10);
			DA=((bs/100)*90);
		}
		else if(bs>=10000)
		{
			HRA=2000;
			DA=((bs/100)*98);
		}
		GS=bs + DA + HRA;
		System.out.println("Employee Gross Salary:"+GS);
		
	}	
}