package HashMapPractice;

import java.util.HashMap;

public class FirstNonRepeatingCharusingHashmap {

	public static int firstUniqChar(String s) {
        // Edge case: empty string
        if (s == null || s.length() == 0) {
            return -1;
        }

        // Step 1: Build the character frequency map
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i; // Return the index of the character
            }
        }

        return -1; // Return -1 if no unique character exists
    }

    public static void main(String[] args) {
        String text = "Hello";
        int index = firstUniqChar(text);
        
        if (index != -1) {
            System.out.println("First non-repeating character is '" + text.charAt(index) + "' at index " + index);
        } else {
            System.out.println("No unique character found.");
        }
    }
}
