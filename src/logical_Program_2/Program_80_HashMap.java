package logical_Program_2;

import java.util.HashMap;
import java.util.Set;

public class Program_80_HashMap 

{
	
	public static void main(String[] args)
	{
		
		HashMap<Integer, String> mp=new HashMap<Integer, String>();
		mp.put(001, "Shoaib");
		mp.put(002, "Arman");
		mp.put(003, "Afroj");
		mp.put(004, "Abc");
		mp.put(005, "Xyz");
		
		
		System.out.println("------Contains------");
		
		System.out.println(mp.containsKey(002));
		System.out.println(mp.containsKey(010));
		
		
		System.out.println("------Get-----");
		
		System.out.println(mp.get(001));
		System.out.println(mp.get(005));
		
		System.out.println("------GetAllKey------");
		
		Set<Integer> allkey = mp.keySet();
		
		for(Integer key:allkey)
		{
			System.out.println(key);
		}
		
		System.out.println("------GetAllKey & Value------");
		
		for(Integer Key:allkey)
		{
			System.out.println(Key+" "+mp.get(Key));
		}
		
	}
	
	

}
