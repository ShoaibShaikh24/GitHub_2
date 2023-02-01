package logical_Program;

public class Example_87_Pallidrome 
{
	
	public static void main(String[] args) 
	{
		
		String Org = "Arman";
		
		String rev="";
		
		for(int i=Org.length()-1; i>=0; i--)
		{
			rev = rev+Org.charAt(i);
		}
		
		if (Org.equals(rev))
		{
			System.out.println("Given String is Pallidrome");
		} 
		
		else 
		{
			System.out.println("Given String is Not Pallidrome");
		}
		
	}

}
