package logical_Program;

import java.util.Arrays;

public class Example_51_Compare_Two_integerArray

{
	
	
	public static void main(String[] args) 
	{
		
		int A1[]= {1,2,3,4,5};
		int A2[]= {1,2,3,4,5};
		int A3[]= {6,7,8,9,0};
		
		System.out.println(Arrays.equals(A1, A3));
		System.out.println(Arrays.equals(A1, A2));
		System.out.println(Arrays.equals(A3, A2));
		
	}

}
