package InterviewSet;

import java.util.HashSet;
import java.util.Set;

public class Int19Intersection {

	
	public static void main(String[] args) {
		int[] data1= {1,2,3,4,5};
		int[] data2= {2,3,7,3,8};
		Set<Integer> result= new HashSet<>();
		
		for(int i=0;i<data1.length;i++) {
			for(int j=0;j<data2.length;j++) {
				if(data1[i]==data2[j]) {
					result.add(data2[j]);
				}
			}
		}
		System.out.println(result);
		
	}
	
	
	
}
