package logical_Program_2;

public class Program_31_Reverse_Number_WithOut_StringFunction 
{
	
	public static void main(String[] args) 
	{
		
		int Num = 987654321; 
		int Rev = 0; 
		
		for(int i=Num; i>0; i = i/10)
		{
			int Rem = i%10;
			
			Rev = Rev*10+Rem;
		}
		
		
		System.out.println(Rev);
		
	}

}
