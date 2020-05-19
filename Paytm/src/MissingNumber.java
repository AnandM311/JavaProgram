import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 10, 11, 13, 14 }; // number should be in sorted format
		int sum = 0;
		int fNum = a[0];
		int lNum = a[a.length - 1];
		System.out.println(fNum + " " + lNum);
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int sum1 = 0;
		for (int j = fNum; j <= lNum; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1 - sum);

		findDuplicat();
	}

	public static void findDuplicat() {
		String names[] = { "Java", "Ruby", "C", "C++", "Java", "C" };
		// 1. Compare each element O(n*n) --> worst solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j]))
					System.out.println("Duplicate element is " + names[i]);
			}
		}

		// 2. using HashSet :- Store unique value O(n)

		System.out.println("------Using HashSet------");
		Set<String> set = new HashSet<String>();
		for (String name : names) {
			if (set.add(name) == false) {
				System.out.println("Duplicate element is " + name);
			}
		}

		System.out.println(set);

		// 3 using HashMap O(2n)
		System.out.println("------Using HashMap------");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = map.get(name);
			if (count == null) {
				map.put(name, 1);
			} else {
				map.put(name, count + 1);
			}
		}
	
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet)
		{
			if (entry.getValue()>1)
				System.out.println("Duplicate element is " + entry.getKey());

		}

	}

}
