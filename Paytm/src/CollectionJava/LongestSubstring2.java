package CollectionJava;

import java.util.LinkedHashMap;

public class LongestSubstring2 {

	public static void main(String[] args) {
		longestSubstring("anand");

	}

	public static void longestSubstring(String str) {
		char[] charArray = str.toCharArray();
		//System.out.println(charArray);

		String longestSubstring = null;
		int longestSubstringLength = 0;

		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];

			if (!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);
			}

			else {
				i = charPosMap.get(ch);
				charPosMap.clear();
				
			}
			if (charPosMap.size() > longestSubstringLength) {
				longestSubstringLength = charPosMap.size();

				longestSubstring = charPosMap.keySet().toString();
			}
		}
		
		System.out.println("Longest sub-string :- "+longestSubstring);
		System.out.println("Longest substring length :- "+longestSubstringLength);
		
	}
}
