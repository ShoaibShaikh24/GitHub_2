package logical_Program_2;

public class Program_35_Reverse_Number_WithOut_StringFunction 
{
	
	public static void main(String[] args) 
	{
		
		int num = 1234321;
		
		int revs = 0;
		
		for(int i=num; i>0; i = i/10)
		{
			int rem = i%10;
					
			revs = revs*10+rem;
					
		}
		
		System.out.println(revs);
		
	}

}
