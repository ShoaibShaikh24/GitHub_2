package logical_Program_2;

public class Program_72_PrintStatementInReverseOrder 
{
	
	
	public static void main(String[] args)
	{
		String s1 = "Shaikh shoaib is name my hellow";
		
		String[] ar = s1.split(" ");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
