package Logical_Program_1;

import java.util.Scanner;

public class program_04_UserInput 

{
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter First Digit : ");
		int r1=scan.nextInt();
		
		System.out.print("Enter Second Digit : ");
		int r2 = scan.nextInt();
		
		System.out.println("Multiplication of Two Num : "+(r1*r2));
		
	}

}
