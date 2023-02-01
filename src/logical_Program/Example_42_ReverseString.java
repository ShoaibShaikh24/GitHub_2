package logical_Program;

public class Example_42_ReverseString
{
	
	public static void main(String[] args) 
	{
		
		String org = "Shoaib Shaikh";
		String revs="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			
			revs = revs+org.charAt(i);
			
		}
		
		System.out.println(revs);
		
	}

}
