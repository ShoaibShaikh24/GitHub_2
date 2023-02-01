package logical_Program;

import java.util.Scanner;

public class Example_11_UserInput 
{
	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter Number 1 : ");
		
		int num1 = s1.nextInt();
		
		System.out.print("Enter Number 2 : ");
		
		int num2 = s1.nextInt();
		
		
		System.out.println("Addition of Two Nums : "+(num1+num2));
		
	}

}
