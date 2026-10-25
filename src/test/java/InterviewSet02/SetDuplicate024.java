package InterviewSet02;

import java.util.HashSet;

public class SetDuplicate024 {
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,1,2,5,6};
		
		HashSet<Integer> unique = new HashSet<>();
		
		
		for(int i=0;i<data.length;i++) {
			if(unique.add(data[i])==false) {
				System.out.println("The element " +data[i] + " are duplicate in given array.");
			}
		}
		
	}

}
