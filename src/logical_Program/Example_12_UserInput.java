package logical_Program;

import java.util.Scanner;

public class Example_12_UserInput 
{
	
	public static void main(String[] args) 
	{
		
		Scanner s2 = new Scanner(System.in);
		
		System.out.print("Enter Name 1 : ");
		
		String name1 = s2.next();
		
		System.out.print("Enetr Name 2 : ");
		
		String name2 = s2.next();
		
		System.out.println((name1.length()));
		
		System.out.println(name2.length());
	
	}

}
