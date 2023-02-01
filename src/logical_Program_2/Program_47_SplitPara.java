package logical_Program_2;

public class Program_47_SplitPara 
{
	
	public static void main(String[] args) 
	{
		
		String s1 = "hellow my name is Shoaib";
		
		String[] ar = s1.split(" ");
		
		System.out.println(ar[3]);
		
		System.out.println("----------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
