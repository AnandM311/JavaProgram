package CollectionJava;

import java.util.HashSet;

public class LogestSubstring {

	public static void main(String[] args) {
		
		System.out.println(lenofLongestSubstring("anandnanana"));

	}

	public static int lenofLongestSubstring(String s) {
		int maxLength = 0;
		HashSet<Character> set = new HashSet<Character>();
		int i = 0;
		int j = 0;
		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j - i);
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return maxLength;

	}
}
