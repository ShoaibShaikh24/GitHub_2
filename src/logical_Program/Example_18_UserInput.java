package logical_Program;

import java.util.Scanner;

public class Example_18_UserInput
{
	
	public static void main(String[] args) 
	{
		
		System.out.print("Enter First Num : ");
		
		Scanner scan=new Scanner(System.in);
		int result1 = scan.nextInt();
		
		System.out.print("Enter Second Num : ");
		int result2 = scan.nextInt();
		
		System.out.print("MultiPlication Of Two Num : "+(result1*result2));
		
	}

}
