package CollectionJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintUniquedWords {

	public static void main(String[] args) {
		String str = "Java is great. Grails is also great";
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

		Pattern p = Pattern.compile("[a-zA-Z]+");

		Matcher m = p.matcher(str);
		while (m.find()) {
			String stemp = m.group();
			if (!wordMap.containsKey(stemp)) {
				wordMap.put(stemp, 1);
			} else

				wordMap.put(stemp, wordMap.getOrDefault(stemp, 0) + 1);
		}
		System.out.println(wordMap);
		Set<String> set = wordMap.keySet();
		System.out.println(set);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String w = itr.next();

			if (wordMap.get(w) == 1)
				System.out.println(w);
		}
	}

}
