package StarPattern;

public class Example_25 
{
	
	//***
	//**
	//*
	
	
	public static void main(String[] args)
	{
		
		int star=3;
		int space=0;
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
			
			star--;
			space++;
			
		}
		
		
	}

}
