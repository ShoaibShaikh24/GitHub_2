package logical_Program_2;

public class Program_10_Prime_Number 
{
	
	public static void main(String[] args) 
	
	{
		
		int num = 5;
		int count = 0;
		
		for(int i=2; i<num; i++)
		{
			if (num%i==0) 
			{
				count++;
				break;
			}
		
		}
		
		if (count==1) 
		{
			System.out.println("Given Num is Not Prime Number");
		}
		
		else
		{
			System.out.println("Given Num is Prime Number");
		}
		
	}

}
