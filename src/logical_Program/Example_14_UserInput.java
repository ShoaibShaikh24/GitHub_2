package logical_Program;

import java.util.Scanner;

public class Example_14_UserInput 
{
	public static void main(String[] args) 
	{
		
		Scanner	s4=new Scanner(System.in);
		
		System.out.print("Enter 1st No : ");
		
		int result1 = s4.nextInt();
		
		System.out.print("Enter 2nd No : ");
		
		int result2 = s4.nextInt();
		
		System.out.println("Addition of two No = "+(result1+result2));
		
		
	}

}
