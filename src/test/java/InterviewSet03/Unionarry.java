package InterviewSet03;

import java.util.HashSet;

public class Unionarry {
	
	public static void main(String[] args) {
		int[] dataset1= {1,2,3,4,5};
		int[] dataset2= {4,2,5,6};
		
		HashSet<Integer> result = new HashSet<>();
		
		for(int i=0;i<dataset1.length;i++) {
			result.add(dataset1[i]);
		}
		for(int j=0;j<dataset2.length;j++) {
			result.add(dataset2[j]);
		}
		System.out.println(result);
		
		
	}

}
