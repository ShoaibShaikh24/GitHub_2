package Logical_Program_1;

import java.util.Scanner;

public class program_01_UserInput 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter 1st Number : ");
		int result1 = scan.nextInt();
		
		System.out.print("Enter 2nd Number : ");
		int result2 = scan.nextInt();
		
		System.out.print("Addition Of Two Number : "+(result1+result2));
		
	}
	

}
