package InterviewSet02;

import java.util.HashSet;
import java.util.Set;

public class Intersection007 {
	
	
	public static void main(String[] args) {

		int[] datad1= {1,2,3,4,5};
		int[] datad2= {1,4,5,6};

		Set<Integer> result = new HashSet<>();
		
		for(int i=0;i<datad1.length;i++) {
			for(int j=0;j<datad2.length;j++) {
				if(datad1[i]==datad2[j]) {
					result.add(datad1[i]);
				}
			}
		}
		System.out.println(result);
		
		
		
	}
	

}
