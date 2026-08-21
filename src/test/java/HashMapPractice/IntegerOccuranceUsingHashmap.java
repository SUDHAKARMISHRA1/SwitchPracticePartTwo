package HashMapPractice;

import java.util.HashMap;

public class IntegerOccuranceUsingHashmap {
	
	public static void main(String[] args) {
		int[] data = {1,2,3,5,3,2,4,1,0};
		HashMap<Integer,Integer> result = new HashMap<>();
		for(int i=0;i<data.length;i++) {
			if(result.containsKey(data[i])==true) {
				result.put(data[i], result.get(data[i])+1);
			}else {
				result.put(data[i],1);
			}
		}
		System.out.println(result);
	}

}
