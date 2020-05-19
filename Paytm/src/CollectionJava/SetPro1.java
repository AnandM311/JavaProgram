package CollectionJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPro1 {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		int i = 0;
		int[] arr = new int[set1.size()];

		System.out.println(set1);

		Iterator<Integer> it = set1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(set1.isEmpty());

		set2 = (HashSet<Integer>) set1.clone();
		set1.add(40);
		System.out.println("Set1 After clone " + set1);

		System.out.println("Set2: " + set2);

//		for(int k : set1)
//		{
//			arr[i]=k;
//			i++;
//		}
//		
//		for(int j=0;j<arr.length;j++)
//		{
//			System.out.println("Array of "+j+" "+arr[j]);
//		}
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(20);
		lst.add(30);
		
		ListIterator<Integer> lisrIt = lst.listIterator(lst.size());
		while(lisrIt.hasPrevious())
		{
			System.out.println(lisrIt.previous());
		}
	
		
//		while (it.hasNext()) {
//			treeSet.add(it.next());
//		}
//		
//		System.out.println("TreeSet: "+treeSet);
//		
	

	}

}
