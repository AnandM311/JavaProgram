package CollectionJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> ArrList = new ArrayList<Integer>();

		ArrList.add((int) (Math.random() * 10));
		ArrList.add((int) (Math.random() * 10));
		ArrList.add((int) (Math.random() * 10));
		ArrList.add((int) (Math.random() * 10));
		ArrList.add((int) (Math.random() * 10));
		ArrList.add((int) (Math.random() * 10));

		System.out.println(ArrList);

		Collections.sort(ArrList);

		System.out.println(ArrList);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);

		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			// TODO Auto-generated method stub
			return (o1.getValue().compareTo(o2.getValue()));
		}
		});
		System.out.println(list);
	}

}
