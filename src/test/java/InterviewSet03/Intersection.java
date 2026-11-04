package InterviewSet03;

import java.util.HashSet;

public class Intersection {
	
	public static void main(String[] args) {
		int[] dataset1= {1,2,3,4,5};
		int[] dataset2= {4,2,5,6};
		
		HashSet<Integer> result = new HashSet<>();
		
		for(int i=0;i<dataset1.length;i++) {
			for(int j=0;j<dataset2.length;j++) {
				if(dataset1[i]==dataset2[j]) {
					result.add(dataset1[i]);
				}
			}
		}
		System.out.println(result);
		
		
	}

}
