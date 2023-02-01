package Logical_Program_1;

public class Program_71_Armstong_Number 
{
	
	public static void main(String[] args) 
	{
		
		int num = 407; 
		
		int sum = 0; 
		
		for(int i=num; i>0; i=i/10)
		{
			int rem = i%10; 
			
			sum = sum+(rem*rem*rem);
		}
		
		if (num==sum) 
		{
		System.out.println("Given Number is Armstrong Number");	
		}
		
		else 
		{
			System.out.println("Given Number is Not Armstrong Number");
		}
		
	}

}
