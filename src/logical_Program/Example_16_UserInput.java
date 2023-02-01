package logical_Program;

import java.util.Scanner;

public class Example_16_UserInput
{
	
	public static void main(String[] args) 
	{
		
		
		Scanner s6=new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		
		int result1 = s6.nextInt();
		
		System.out.print("Enter Second Number : ");
		
		int result2 = s6.nextInt();
		
		System.out.print("Addition Of Num : "+(result1+result2));
		
	}

}
