package logical_Program_2;

public class Program_49_SplitPara 
{
	
	public static void main(String[] args) 
	{
		
		String s1 = "Hellow Good Morning i'm shoaib Shiakh";
	
		String[] ar = s1.split(" ");
		
		System.out.println(ar[4]);
		
		System.out.println("--------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
