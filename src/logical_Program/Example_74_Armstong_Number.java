package logical_Program;

public class Example_74_Armstong_Number 
{
	
	public static void main(String[] args) 	
	{
		
		int OrgNum = 1234;
		
		int Sum=0;
		
		for(int i=OrgNum; i>0; i = i/10)
		{
			int rem = i%10;
			
			Sum = Sum+(rem*rem*rem);
			
		}
		
		if (OrgNum==Sum) 
		{
			
			System.out.println("Given Number "+OrgNum+" is an Armstrong Number");
			
		}
		
		
		else
		{
			
			System.out.println("Given Number "+OrgNum+" is Not an Armstrong Number");
			
		}
		
		
	}

}
