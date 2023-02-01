package logical_Program_2;

import java.util.HashMap;
import java.util.Set;

public class Program_83_HashMap 

{
	
	public static void main(String[] args) 
	
	{
		
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(101, "Shoaib");
		mp.put(102, "Arman");
		mp.put(103, "Afroj");
		mp.put(104, "Xyz");
		mp.put(105, null);								
		
		System.out.println(mp.containsKey(104));
		
		System.out.println("-----------------");
		
		System.out.println(mp.get(105));
		System.out.println(mp.get(104));
		
		System.out.println("-----------");
		
		Set<Integer> allKey = mp.keySet();
		
		for(Integer key:allKey)
		{
			System.out.println(key);
		}
		
		System.out.println("----------");
		
		
		for(Integer Key:allKey)
		{
			System.out.println(Key+" "+mp.get(Key));
		}
		
	}	
	
	
}
