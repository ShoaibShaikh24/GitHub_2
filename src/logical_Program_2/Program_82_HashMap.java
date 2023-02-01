package logical_Program_2;

import java.util.HashMap;
import java.util.Set;

public class Program_82_HashMap 
{
	
	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(101, "ABC");
		mp.put(102, "EFG");
		mp.put(103, "PQR");
		mp.put(104, "XYZ");
		
		
		System.out.println(mp.containsKey(102));
		System.out.println(mp.containsKey(104));
		
		System.out.println("----------");
		
		System.out.println(mp.get(102));
		System.out.println(mp.get(103));
		
		System.out.println("-----------");
		
		Set<Integer> allKey = mp.keySet();
		
		for(Integer key:allKey)
		{
			System.out.println(key);
		}
		
		System.out.println("-----------");
		
		for(Integer Key:allKey)
		{
			System.out.println(Key+"|"+mp.get(Key));
		}
		
		
		
	}
	

}
