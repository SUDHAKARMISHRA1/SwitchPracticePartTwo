package InterviewSet02;

import java.util.HashSet;
import java.util.Set;

public class Union006 {
	
	
	public static void main(String[] args) {
		int[] datad1= {1,2,3,4,5};
		int[] datad2= {1,4,5,6};
		
		Set<Integer> result = new HashSet<>();
	
		for(int i=0;i<datad1.length;i++) {
			result.add(datad1[i]);
		}
		
		for(int j=0;j<datad2.length;j++) {
			result.add(datad2[j]);
		}
		
		System.out.println("The union of datad1 and datad2 is " +result);
		
		
	}

}
