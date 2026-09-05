package InterviewSet;

import java.util.HashMap;
import java.util.Map;

public class Int9RepetativeCharwithNum {
	
	
    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "HelloWHello";

        System.out.println(input1 + " -> " + replaceRepeatsWithCount(input1));
        System.out.println(input2 + " -> " + replaceRepeatsWithCount(input2));
    }

    public static String replaceRepeatsWithCount(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        // Map to store: Character -> How many times it has appeared so far
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Increment the count for this character (defaults to 0 if new)
            int currentCount = charCountMap.getOrDefault(ch, 0) + 1;
            charCountMap.put(ch, currentCount);

            if (currentCount == 1) {
                // First time seeing this character -> keep it as text
                sb.append(ch);
            } else {
                // Subsequent times -> replace it with the current count
                sb.append(currentCount);
            }
        }

        return sb.toString();
    }

}
