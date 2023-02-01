package Logical_Program_1;

import java.util.Scanner;

public class program_03_UserInput 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Num One : ");
		int r1 = scan.nextInt();
		
		System.out.print("Enter Num Two : ");
		int r2 = scan.nextInt();
		
		System.out.println("Addition Of Two Num : "+(r1+r2));
		
	}

}
