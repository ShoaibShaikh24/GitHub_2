package logical_Program;

import java.util.Scanner;

public class Example_17_UserInput 
{
	
	public static void main(String[] args) 
	{
		
		System.out.print("Enter First Number : ");
		
		Scanner scan=new Scanner(System.in);
		
		int R1 = scan.nextInt();
		
		System.out.print("Enter Second Number : ");
		
		 int R2 = scan.nextInt();
		 
		 System.out.print("Addition of Two Num : "+(R1+R2));
		
	}

}
