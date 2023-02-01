package logical_Program;

public class Example_73_Armstong_Number
{
	
	public static void main(String[] args) 
	{
		
		int OrgNum = 371;
		
		int sum=0;
		
		for(int i=OrgNum; i>0; i=i/10)
		{
			int rem = i%10;
			
			sum=sum+(rem*rem*rem);
		}
		
		
		if (OrgNum==sum) 
		{
			
			System.out.println("Given Number "+OrgNum+" is an Armstrong Number");
			
		} 
		else
		{
			
			System.out.println("Given Number "+OrgNum+" is Not an Armstrong Number");

		}
		
	}

}
