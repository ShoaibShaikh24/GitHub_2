package logical_Program;

public class Example_80_Pallidrome 

{
	
	
	public static void main(String[] args) 
	{
		
		String name="Shoaib";
		
		String revs = "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			revs = revs+name.charAt(i);
		}
		
		
		
		if (name.equals(revs)) 
		{
			System.out.println("Given String is Pallidrome");
		} 
		else
		{
			System.out.println("Given String is NOT Pallidrome");
		}
		
		
	}

}
