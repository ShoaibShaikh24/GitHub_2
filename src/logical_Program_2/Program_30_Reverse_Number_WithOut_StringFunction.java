package logical_Program_2;

public class Program_30_Reverse_Number_WithOut_StringFunction 
{
	
	public static void main(String[] args) 
	{
		
		int OrgNum = 12345;
		int Rev = 0;
		
		for(int i=OrgNum; i>0; i=i/10)
		{
			int rem = i%10;
			
			Rev = Rev*10+rem;
		}
		
		System.out.println(Rev);
		
	}

}
