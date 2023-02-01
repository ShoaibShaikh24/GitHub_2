package logical_Program_2;

public class Program_29_ReverseNumber 
{
	
	public static void main(String[] args) 
	{
		
		int OrgNum = 6546342;
		String Num = Integer.toString(OrgNum);
		
		String Rev = "";
		
		for(int i=Num.length()-1; i>=0; i--)
		{
			Rev = Rev+Num.charAt(i);
		}
		
		int RevNum = Integer.parseInt(Rev);
		
		System.out.println(RevNum);
		
	}

}
