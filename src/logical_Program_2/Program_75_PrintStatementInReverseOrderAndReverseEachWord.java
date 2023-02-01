package logical_Program_2;

public class Program_75_PrintStatementInReverseOrderAndReverseEachWord
{
	
	
	public static void main(String[] args)
	{
		String s1 = "My name is Shoaib Shaikh";
		
		String[] ar = s1.split(" ");
		
		
		for(int i=ar.length-1; i>=0; i--)
		{
			String Org = ar[i];
			
			String Rev = reverseString(Org);
			
			System.out.print(Rev+" ");
			
		}
		
		
	}
	
	public static String reverseString(String inp)
	{
		String Rev = "";
		
		
		for(int j=inp.length()-1; j>=0; j--)
		{
			Rev = Rev+inp.charAt(j);
		}
		
		return Rev;
			
	}

}
