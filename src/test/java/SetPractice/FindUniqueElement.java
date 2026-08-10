package SetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUniqueElement {

	
	public static void main(String[] args) {
		int[] data = {1,2,3,5,6,6,7,8,9,1,2};
		Set<Integer> result = new HashSet<>();
		for(int i=0;i<data.length;i++) {
			result.add(data[i]);
		}
		System.out.println("Given Input Data: " +Arrays.toString(data));
		System.out.println("Unique data after duplicate removal: " +result);
		
	}
}
