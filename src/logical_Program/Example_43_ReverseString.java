package logical_Program;

public class Example_43_ReverseString 

{
	
	public static void main(String[] args) 
	{
		
		String org = "XYZ";
		String rev = ""; 
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
