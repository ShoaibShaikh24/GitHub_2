package StarPattern;

public class Example_26 
{
	public static void main()
	{
		
		int star = 4;
		int space = 0;
		
		for(int i=1; i<=4; i++)
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
			star++;
			
			
		}
		
	}
	

}
