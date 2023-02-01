package logical_Program_2;

public class Program_12_Prime_Number 
{
	
	public static void main(String[] args) 
	{
		
		int num = 7;
		int count = 0;
		
		for(int i=2; i<num; i++)
		{
			
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("Given Number is Not Prime Number");
		}
		else
		{
			System.out.println("Given Number is Prime Number");
		}
		
		
	}

}
