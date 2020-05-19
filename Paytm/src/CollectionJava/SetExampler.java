package CollectionJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetExampler {
	public static void main(String[] agrs)
	{
		int[] stream = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};
		int count=0;
		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		for(int num : stream)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println(map);
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for(Entry<Integer, Integer> entry :entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Num "+entry.getKey()+" found "+entry.getValue()+" times");
			}
		}
		
		ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1= new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		alist.add(a1);
		
ArrayList<Integer> a2= new ArrayList<Integer>();
		
		a2.add(10);
		a2.add(20);
		a2.add(30);
		alist.add(a2);
		
		for(int i=0;i<alist.size();i++)
		{
			for(int j=0;j<alist.get(i).size();j++)
			{
				System.out.print(alist.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
