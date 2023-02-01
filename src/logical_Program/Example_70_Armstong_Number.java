package logical_Program;

public class Example_70_Armstong_Number

{
	
	public static void main(String[] args) 
	{
		
		int OrgNum=153;
		
		int sum=0;
		
		
		for(int i=OrgNum; i>0; i=i/10)
		{
			int rem = i%10;
		  sum = sum+(rem*rem*rem);
		}
		
		if (OrgNum==sum) 
		{
			System.out.println("Number "+OrgNum+" is an Armstrong Number");
		}
		else
		{
			System.out.println("Number "+OrgNum+" is NOT an Armstrong Number");
		}
		
	}
	
	
	

}