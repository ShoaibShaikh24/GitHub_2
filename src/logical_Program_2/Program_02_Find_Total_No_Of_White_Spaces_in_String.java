package logical_Program_2;

public class Program_02_Find_Total_No_Of_White_Spaces_in_String

{
	
	public static void main(String[] args) 
	{
		
		String str = " a b c d e f ";
		int count = 0;
		
		for(int i=0; i<=str.length()-1; i++)
		{
			
			char s1 = str.charAt(i);
			
			if(s1==' ')
			{
				count++;
			}
		}
		
		System.out.println("Given Spaces in String is "+count);
		
	}
	

}
