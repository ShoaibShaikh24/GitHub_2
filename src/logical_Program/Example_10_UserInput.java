package logical_Program;

import java.util.Scanner;

public class Example_10_UserInput
{
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter First Num : ");
		int r1 = scan.nextInt();
		
		System.out.print("Enter Second Num : ");
		int r2 = scan.nextInt();
		
		System.out.print("Substraction Of Two Num : "+(r1-r2));
		
	}

}
