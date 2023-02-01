package logical_Program;

import java.util.Scanner;

public class Example_69_Fact_of_Number 

{
	
	public static void main(String[] args) 
	
	{
		
		
		
		Scanner Scan=new Scanner(System.in);
		
		System.out.print("Enter Num : ");
		int num = Scan.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=num; i++ )
		{
			fact = fact*i;
		}
		
		System.out.println(fact);
		
		
	}

}
