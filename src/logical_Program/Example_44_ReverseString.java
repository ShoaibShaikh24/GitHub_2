package logical_Program;

public class Example_44_ReverseString 

{
	
	public static void main(String[] args) 
	{
		
		String org = "REVERSE";
		String rev = "";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev = rev+org.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
