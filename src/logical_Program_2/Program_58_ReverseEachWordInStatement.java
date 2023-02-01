package logical_Program_2;

public class Program_58_ReverseEachWordInStatement 
{
	
	public static void main(String [] args)
	{
		
		String s1 = "This is Reverse Each Word In Statement Method";
		
		String [] ar = s1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String Org = ar[i];
			
			String Rev = "";
			
			for(int j=Org.length()-1; j>=0; j--)
			{
				Rev = Rev + Org.charAt(j);
			}
				
			System.out.print(Rev+" ");
			
		}
		
		
		
	}
	

}
