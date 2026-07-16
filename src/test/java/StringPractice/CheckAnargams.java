package StringPractice;

import java.util.HashMap;
import java.util.Iterator;

public class CheckAnargams {
	
	public static void main(String[] args) {
		String data1 = "aabb";
		String data2 = "abbb";
		HashMap<Character, Integer> result = new HashMap<>();
		if(data1.length()!=data2.length()) {
			System.out.println("Given strings are not anargam");
		}else {
			for(int i=0;i<data1.length();i++) {
				if(result.containsKey(data1.charAt(i))) {
					result.put(data1.charAt(i), result.get(data1.charAt(i))+1);
				}else {
					result.put(data1.charAt(i),1);
				}
			}
			for(int j=0;j<data2.length();j++) {
				if(result.containsKey(data2.charAt(j))) {
					result.put(data2.charAt(j), result.get(data2.charAt(j))-1);
				}else {
					System.out.println("Given String are not anargams");
				}
			}
			Iterator<Character> it = result.keySet().iterator();
			while(it.hasNext()) {
				char key = it.next();
				int val = result.get(key);
				if(val>=1) {
					System.out.println("Given String are not anargams");
					break;
				}else {
					System.out.println("Given String are anargams");
					break;
				}	
			}
		}
	}

}
