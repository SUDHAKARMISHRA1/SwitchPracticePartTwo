package SetPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementUsingSet {
	
	
	public static void main(String[] args) {
		int[] data = {1,2,3,1,2,4,};
		Set<Integer> data2 = new HashSet<>();
		for(int i=0;i<data.length;i++) {
			if(data2.add(data[i])==false) {
				System.out.println("Duplicate value is: " +data[i]);
			}
		}
	}

}
