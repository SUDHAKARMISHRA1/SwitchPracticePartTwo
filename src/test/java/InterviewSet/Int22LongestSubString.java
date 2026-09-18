package InterviewSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Int22LongestSubString {
	
	public static void main(String[] args) {
		String data = "abcd";
		Set<String> allSub = new HashSet<>();
		ArrayList<String> allSub1 = new ArrayList<>();
		for(int i=0;i<data.length();i++) {
			for(int j=i+1;j<=data.length();j++) {
				allSub.add(data.substring(i,j));
				allSub1.add(data.substring(i,j));
			}			
		}
	
		String longest = Collections.max(allSub1, Comparator.comparingInt(String::length));
        System.out.println("Longest string: " + longest);
	}

}
