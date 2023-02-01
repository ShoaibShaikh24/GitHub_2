package logical_Program;

import java.util.Arrays;

public class Example_54_Compare_Two_integerArray 
{
	
	public static void main(String[] args) 
	{
		
		int n[]= {1,2,3,4,5};
		int m[]= {1,2,4,5,6};
		int o[]= {1,2,3,4,5};
		
		
		System.out.println(Arrays.equals(n, m));
		System.out.println(Arrays.equals(n, o));
		System.out.println(Arrays.equals(o, m));
		
		
		
	} 
	

}
