package logical_Program;

import java.util.Scanner;

public class Example_61_Fact_of_Number 
{
	
	public static void main(String[] args) 
	{
		
		System.out.print("Enter Number : ");
		Scanner s1=new Scanner(System.in);
		int num = s1.nextInt();
		
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
		
		
	}

}
