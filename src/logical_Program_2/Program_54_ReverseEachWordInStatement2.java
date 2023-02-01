package logical_Program_2;

public class Program_54_ReverseEachWordInStatement2 
{
	
	public static void main(String[] args) 
	{
		
		String s1 = "Hii Good morning My name is Shoaib";
		
		String[] ar = s1.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String Org = ar[i];
			
			  String Rev = reverseString(Org);
			
			System.out.println(Rev+" ");
			
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
