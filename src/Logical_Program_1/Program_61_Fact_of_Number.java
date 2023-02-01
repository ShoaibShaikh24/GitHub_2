package Logical_Program_1;

import java.util.Scanner;

public class Program_61_Fact_of_Number 
{
	
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Num : ");
		int num=scan.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=num; i++)		
		{
			fact=fact*i;
		}
		
		System.out.print("Fact Num: "+(fact));
	}

}
