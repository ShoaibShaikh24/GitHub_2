package logical_Program;

public class Example_46_ReverseString
{
	
	public static void main(String[] args) 
	{
		
		String Org="Shoaib";
		
		String Revs="";
		
		for(int i=Org.length()-1; i>=0; i--)
		{
			Revs = Revs+(Org.charAt(i));
		}
		
		System.out.println(Revs);
		
	}

}
