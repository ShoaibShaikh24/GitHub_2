package logical_Program_2;

public class Program_55_ReverseEachWordInStatement 
{
	
	
	public static void main(String [] args)
	{
		String s1 = "Reverse this Sentence by Using Program";
		
		String[] ar = s1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String Org = ar[i];
			
			String Rev = "";
			
			for(int j=Org.length()-1; j>=0; j--)
			{
				Rev = Rev+Org.charAt(j);
			}
			
			System.out.print(Rev+" ");
			
		}
	}

}
