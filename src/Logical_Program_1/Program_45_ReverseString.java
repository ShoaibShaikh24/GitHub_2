package Logical_Program_1;

public class Program_45_ReverseString 
{
	
	public static void main(String[] args) 
	{
		
		String Org="RADAR";
		String Rev="";
		
		
		for(int i=Org.length()-1; i>=0; i--)
		{
			Rev = Rev+Org.charAt(i);
		}
		
		System.out.println(Rev);
		
	}

}
