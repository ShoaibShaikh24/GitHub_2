package logical_Program_2;

import java.util.HashMap;
import java.util.Set;

public class Program_85_HashMap 
{
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> mp=new HashMap<Integer, String>();
		
		mp.put(01, "Shoaib");
		mp.put(02, "Arman");
		mp.put(03, "Afroj");
		mp.put(04, "abc");
		mp.put(05, "Xyz");
		
		System.out.println(mp.containsKey(03));
		System.out.println(mp.containsKey(07));
		
		System.out.println("-----------");
		
		System.out.println(mp.get(03));
		System.out.println(mp.get(01));
		System.out.println(mp.get(05));
		
		
		System.out.println("-------------");
		
		Set<Integer> allKey = mp.keySet();
		
		for(Integer key:allKey)
		{
			System.out.println(key);
		}
		
		System.out.println("-----------------");
		
		for(Integer Key:allKey)
		{
			System.out.println(Key+" "+mp.get(Key));
		}
		
	}

}
