package logical_Program;

public class Example_79_Armstong_Number 

{
	
	public static void main(String[] args) 
	
	{
		
		int num=407; 
		int sum=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem = i%10;
			sum = sum+(rem*rem*rem);
		}
		
		if (num==sum) 
		{
			System.out.println("Is Armstrong Num");	
		}
		
		else
		{
			System.out.println("Is Not Armstrong Num");
		}
		
	}

}
