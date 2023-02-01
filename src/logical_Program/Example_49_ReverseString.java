package logical_Program;

public class Example_49_ReverseString 
{
	
	public static void main(String[] args) 
	{
		
		String Name = "Arman";
		
		String revs = "";
		
		for(int i=Name.length()-1; i>=0; i--)
		{
			revs = revs+Name.charAt(i);
		}
		
		System.out.println(revs); 
		
		
	}

}
