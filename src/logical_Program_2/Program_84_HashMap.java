package logical_Program_2;

import java.util.HashMap;
import java.util.Set;

public class Program_84_HashMap 
{
	
	public static void main(String[] args) 
	{
		
		
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1, "Shoaib");
		mp.put(2, "Shaikh");
		mp.put(3, "Arman");
		mp.put(4, "Afroj");
		mp.put(5, "XYZ");
		
		
		System.out.println("---------");
		
		System.out.println(mp.containsKey(4));
		System.out.println(mp.containsKey(3));
		
		System.out.println("------------");
		
		System.out.println(mp.get(4));
		System.out.println(mp.get(2));
		
		System.out.println("------------");
		
		Set<Integer> AllKey = mp.keySet();
		
		for(Integer key : AllKey)
		{
			System.out.println(key);
		}
		
		System.out.println("---------------");
		
		for(Integer Key:AllKey)
		{
			System.out.println(Key+" "+mp.get(Key));
		}
		
		
	}
	

}
