package StarPattern;

public class Example_01
{
	
	public static void main(String[] args) 
	{
		
		//****
		//***
		//**
		//*
		int Star = 1;
		
		for(int i=1; i<=4; i++)
		{
			for(int j=Star; j<=4; j++)
			{
				System.out.print("*");
			}
		

			
			System.out.println();
			
			Star--;
			
		}
		
		
	}

}
