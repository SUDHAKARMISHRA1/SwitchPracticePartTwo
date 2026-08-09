package HashMapPractice;

import java.util.HashMap;

public class FrequencyOfEachChar {
	
	public static void main(String[] args) {
		String data = "sdfsasfsdwqaA";
		HashMap<Character, Integer> frequency = new HashMap<>();
		for(int i=0;i<data.length();i++) {
				if(frequency.containsKey(data.charAt(i))) {
					frequency.put(data.charAt(i), frequency.get(data.charAt(i))+1);
				}else {
					frequency.put(data.charAt(i),1);
				}
		}
		System.out.println(frequency);
	}

}
