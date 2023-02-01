package logical_Program;

import java.util.Scanner;

public class Example_19_UserInput 
{
	
	public static void main(String[] args) 
	{
		
		System.out.print("Enter First Num : ");
		Scanner scan=new Scanner(System.in);
		
		int r1 = scan.nextInt();
		
		System.out.print("Enter Second Num : ");
		int r2 = scan.nextInt(); 
		
		System.out.print("Division Of Two Num : "+(r1/r2));
		
	}

}
