package InterviewSet;

import java.util.HashMap;

public class Int001Frequency {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,1,2,3,4,5,6,1,2};
		
		HashMap<Integer,Integer>result = new HashMap<>();
		
		for(int i=0;i<data.length;i++) {
			if(result.containsKey(data[i])==true) {
				result.put(data[i], result.get(data[i])+1);
			}else {
				result.put(data[i], 1);
			}
		}
		System.out.println(result);
		
		
		
	}
	
	
}
