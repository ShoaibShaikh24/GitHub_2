package logical_Program;


public class Example_75_Armstong_Number 

{
	
	
	public static void main(String[] args) 
	{
		int OrgNum = 407;
		
		int Sum = 0;
		
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
			System.out.println("Given Number "+OrgNum+" is NOT an Armstrong Number");
		}
		
	}

}
