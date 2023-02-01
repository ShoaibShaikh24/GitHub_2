package Logical_Program_1;

import java.util.Scanner;

public class program_02_UserInput 
{
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter 1st Number : ");
		int r1 = scan.nextInt();
		
		System.out.print("Enter 2nd Number : ");
	 	int r2 = scan.nextInt();
		
		System.out.println("Multi of Two Number : "+(r1*r2));
	 	
	}

}
