package logical_Program_2;

public class Program_03_Find_Total_No_Of_White_Spaces_in_String
{
	
	public static void main(String[] args) 
	{
		
		String org = "a b cd e   fg";
		int count = 0;
		
		for(int i=0; i<=org.length()-1; i++)
		{
			
			char s1 = org.charAt(i); 
			
			if(s1==' ')
			{
				count++;
			}
			
		}
		
		System.out.println("Given Spaces in String is "+count);
		
	}

}
