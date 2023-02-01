package logical_Program;

public class Example_41_ReverseString 
{
	
	public static void main(String[] args) 
	{
		
		String org="ABCDEF";
		String revs="";
		
		
		for(int i=org.length()-1; i>=0; i--)
		{
			revs=revs+org.charAt(i);
		}
		
		System.out.println(revs);
		
	}

}
