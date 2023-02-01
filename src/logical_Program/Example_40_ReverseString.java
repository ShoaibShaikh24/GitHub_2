package logical_Program;

public class Example_40_ReverseString 
{

	public static void main(String[] args)
	{
		
		
		String Org="Shoaib";
		
		String revs="";
		
		for(int i=Org.length()-1; i>=0; i--)
		{
			revs = revs+Org.charAt(i);
		}
		
		
		System.out.println(revs);
		
		
	}

}
