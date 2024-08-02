package minakshiApplication;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCounter {
	 public static int countAnagramPairs(String str) {
	        Map<String, Integer> substringMap = new HashMap<>();

	        // Generate all possible substrings
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j <= str.length(); j++) {
	                String substring = str.substring(i, j);
	                char[] charArray = substring.toCharArray();
	                Arrays.sort(charArray);
	                String sortedSubstring = new String(charArray);

	                substringMap.put(sortedSubstring, substringMap.getOrDefault(sortedSubstring, 0) + 1);
	            }
	        }

	        // Count the number of anagram pairs
	        int anagramPairs = 0;
	        for (int count : substringMap.values()) {
	            if (count > 1) {
	                anagramPairs += (count * (count - 1)) / 2;
	            }
	        }

	        return anagramPairs;
	    }

	    public static void main(String[] args) {
	        String str = "ifailuhkqq";
	        int result = countAnagramPairs(str);
	        System.out.println("Number of anagram pairs: " + result);
	    }
	    
}
