package logical_Program_2;

public class Program_20_ReverseNumber 

{
	

	public static void main(String[] args) 
	{
		
		int OrgNum = 123456;
		String rev = "";
		
		String Num = Integer.toString(OrgNum);
		
		for(int i=Num.length()-1; i>=0; i--)
		{
			rev = rev+Num.charAt(i);
		}
		
		 Object revNum = Integer.parseInt(rev);	
		
		 
		 System.out.println(revNum);
	}

	

}
