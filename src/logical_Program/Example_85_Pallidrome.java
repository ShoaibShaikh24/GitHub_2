package logical_Program;

public class Example_85_Pallidrome 
{
	
	public static void main(String[] args) 
	{
		
		String Org = "RADAR"; 
		String Revs = "";
		
		for(int i = Org.length()-1; i>=0; i--)
		{
			Revs = Revs + Org.charAt(i);
		}
		
		if (Org.equals(Revs)) 
		{
			System.out.println("Given String is Pallidrome");
		} 
		else 
		{
			System.out.println("Given String is Not Pallidrome");
		}
		
	}

}
