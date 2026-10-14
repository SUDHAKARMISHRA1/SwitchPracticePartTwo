package InterviewSet02;

import java.util.HashMap;

public class CharFrequency013 {
	
	public static void main(String[] args) {
		String data = "sudhakar";
		HashMap<Character, Integer> freq= new HashMap<>();
		
		for(int i=0;i<data.length();i++) {
			if(freq.containsKey(data.charAt(i))==true) {
				freq.put(data.charAt(i), freq.get(data.charAt(i))+1);
			}else {
				freq.put(data.charAt(i), 1);
			}
		}
		System.out.println(freq);
		
	}

}
