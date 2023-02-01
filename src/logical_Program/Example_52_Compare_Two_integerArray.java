package logical_Program;

import java.util.Arrays;

public class Example_52_Compare_Two_integerArray 

{
	
	
	public static void main(String[] args)  
	{
		
		int a[]= {1,2,3,4};
		int b[]= {4,5,6,7};
		int c[]= {1,2,3,4};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, a));
		System.out.println(Arrays.equals(c, b));
		
	}

}
