package Logical_Program_1;

public class Program_55_Pallidrome 

{
	
	public static void main(String[] args) 
	{
		
		String Org = "Automation";
		String Rev = "";
		
		for(int i=Org.length()-1; i>=0; i--)
		{
			Rev = Rev+Org.charAt(i);
		}
		
		if (Org.equals(Rev))
		{
			System.out.println("Given String is Pallidrome");
		}
		
		else
		{
			System.out.println("Givenn String is Not Pallidrome");
		}
		
	}
	

}
