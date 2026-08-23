package SetPractice;

import java.util.HashSet;
import java.util.Set;

public class StringConatinUniqueCharusingSet {
	
	public static void main(String[] args) {
		String data = "sudhakar";
		Set<Character> data2 = new HashSet<>();
		for(int i=0;i<data.length();i++) {
			if(data2.add(data.charAt(i))==false) {
				System.out.println("Duplicate value is: " +data.charAt(i));
			}
		}
	}

}
