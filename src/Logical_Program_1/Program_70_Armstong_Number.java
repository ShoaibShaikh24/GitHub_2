package Logical_Program_1;

public class Program_70_Armstong_Number 
{
	
	public static void main(String[] args) 
	{
		
		int a=153;
		
		int r1=0;
		
		for(int i=a; i>0; i=i/10)
		{
			int rem = i%10;
			
			r1 = r1+(rem*rem*rem);
		}
		
		if (a==r1) 
		{
			System.out.println("Given Num is Armstong Number");
		} 
		
		else
		{
			System.out.println("Given Num is Not Armstong Number");
		}
		
		


		
	}

}
