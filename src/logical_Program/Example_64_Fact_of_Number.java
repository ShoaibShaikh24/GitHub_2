package logical_Program;

import java.util.Scanner;

public class Example_64_Fact_of_Number
{
	
	public static void main(String[] args) 
	{
		
		System.out.print("Enetr Number : ");
		
		Scanner s=new Scanner(System.in);
		
		int num = s.nextInt();
		
		int fact=1;
		
		for(int i=1; i<=num; i++)		
			
		{
			fact = fact*i;
		}
				
		System.out.println(fact);
		
		
	}

}
