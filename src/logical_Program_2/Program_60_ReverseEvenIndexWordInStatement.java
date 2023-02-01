package logical_Program_2;

public class Program_60_ReverseEvenIndexWordInStatement 
{
	public static void main(String [] args)
	{
		String s1="hellow my name is Shoaib Shaikh";
		
		String [] ar = s1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String Org = ar[i];
		
			if(i%2==0)
			{
				String Rev = reverseString(Org);
				System.out.print(Rev+" ");
			}
		
		
			else	
			{
				System.out.print(Org+" ");
			}
		
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
