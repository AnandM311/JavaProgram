package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class ArrayListAndSet {

	public static void main(String[] args) {
		ArrayList<String> listOfString = new ArrayList<String>();
		listOfString.add("Geeks");
		listOfString.add("ForGeeks");
		listOfString.add("GeeksForGeeks");
		listOfString.add("Geeks");
		listOfString.add("ForGeeks");
		listOfString.add("GeeksForGeeks");
		listOfString.add("Geeks");
		listOfString.add("ForGeeks");
		listOfString.add("GeeksForGeeks");
		
		ArrayList<String> newlistOfString = new ArrayList<String>();
		
		for(String newlistOfString1:listOfString)
		{
			if(!newlistOfString.contains(newlistOfString1))
			{
				newlistOfString.add(newlistOfString1);
			}
			
		}
		System.out.println(newlistOfString);
		String names[] = { "Java", "Ruby", "C", "C++", "Java", "C" };
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String name: names)
		{
			Integer count = map.get(name);
			if(count==null)
			{
				map.put(name, 1);
			}
			else 
				map.put(name, count+1);
		}
		System.out.println(map);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet)
		{
			if (entry.getValue()>1)
				System.out.println("Duplicate element is " + entry.getKey());

		}
		

	}

}
