package logical_Program;

import java.util.Arrays;

public class Example_53_Compare_Two_integerArray 
{
	
	public static void main(String[] args) 
	{
		
		int a[]= {12,12,12,12};
		int b[]= {12,122,21,12};
		int c[]= {12,12,12,12};
		
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		
		
		
	}

}
