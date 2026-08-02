package StringPractice;

import java.util.HashMap;

public class CharOccuranceInGivenString {

	
	public static void main(String[] args) {
		String data="hello";
		HashMap<Character, Integer> result = new HashMap<>();
		if(data==null) {
			System.out.println("Enter valid string");
		}else if(data.length()<=0) {
			System.out.println("Enter valid string");
		}else {
		
		for(int i=0;i<data.length();i++) {
			if(result.containsKey(data.charAt(i))) {
				result.put(data.charAt(i), result.get(data.charAt(i))+1);
			}else {
				result.put(data.charAt(i), 1);
			}
		}
		System.out.println(result);
		}
	}
}
