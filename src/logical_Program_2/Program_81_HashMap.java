package logical_Program_2;

import java.util.HashMap;
import java.util.Set;

public class Program_81_HashMap 
{
	
	public static void main(String[] args)
	{
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(01, "abc");
		hm.put(02, "efg");
		hm.put(03, "pqr");
		hm.put(04, "xyz");
		
		System.out.println("----Contains----");
		System.out.println(hm.containsKey(03));
		System.out.println(hm.containsKey(01));
		
		
		System.out.println("----Get Value----");
		System.out.println(hm.get(02));
		System.out.println(hm.get(04));
		
		System.out.println("----Get All Keys----");
		Set<Integer> allKey = hm.keySet();
		
		for(Integer key:allKey)
		{
			System.out.println(key);
		}
		
		System.out.println("----GetAllKeys & Values----");
		for(Integer Key:allKey)
		{
			System.out.println(Key+" "+hm.get(Key));
		}
			
	}

}
