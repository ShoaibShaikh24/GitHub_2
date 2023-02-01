package logical_Program;

import java.util.Scanner;

public class Example_15_UserInput 
{
	
	public static void main(String[] args) 
	{
		Scanner s5=new Scanner(System.in);
		
		System.out.print("Enter 1st No :");
		
		float Result1 = s5.nextFloat();
		
		System.out.print("Enter 2nd No :");
		
		float Result2 = s5.nextFloat();
		
		System.out.println("Addition of No. :"+(Result1+Result2));
	
	}

}
