package logical_Program_2;

public class Program_08_Find_Total_No_Of_White_Spaces_in_String 
{
	
	public static void main(String[] args) 
	{
		
		String Org = " ab c  d";
		int Count = 0;
		
		for(int i=0; i<=Org.length()-1; i++)
		{
			char s1 = Org.charAt(i);
			
			if (s1==' ')
			{
				Count++;
			}
		}
		
		System.out.println("Given Spaces in String is "+Count);
		
	}

}
