package logical_Program;

import java.util.Arrays;

public class Example_50_Compare_Two_integerArray
{
	
	
	public static void main(String[] args) 
	{
		
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		int c[]= {40,50,60};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));
		
		
	}

}
