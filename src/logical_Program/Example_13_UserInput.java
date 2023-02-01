package logical_Program;

import java.util.Scanner;

public class Example_13_UserInput
{
	
	public static void main(String[] args) 
	{
		
		Scanner s3 = new Scanner(System.in);
		
		System.out.print("Enter 1st Sem : ");
		
		float result1 = s3.nextFloat();
		
		System.out.print("Enter 2nd Sem : ");
		
		float result2 = s3.nextFloat();
		
		System.out.println((result1+result2)/2);
		
	}

}
