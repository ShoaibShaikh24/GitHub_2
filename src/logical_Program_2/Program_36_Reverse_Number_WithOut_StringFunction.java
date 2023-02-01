package logical_Program_2;

public class Program_36_Reverse_Number_WithOut_StringFunction 
{
	
	public static void main(String[] args) 
	{
		
		int num = 33442211;
		int rev = 0; 
		
		for(int i=num; i>0; i = i/10)
		{
			int rem = i%10;
			
			rev = rev*10+rem;
		}
		
		System.out.println(rev);
		
	}

}
