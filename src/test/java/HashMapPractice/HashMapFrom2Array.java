package HashMapPractice;

import java.util.HashMap;

public class HashMapFrom2Array {
	
	public static void main(String[] args) {
		int[] key = {1,2,3};
		String[] value = {"rohan", "sohan", "mohan"};
		HashMap<Integer,String> result = new HashMap<>();
		if(key.length!=value.length) {
			System.out.println("Pls provide valid data set");
		}else {
			for(int i=0;i<key.length;i++) {
				result.put(key[i], value[i]);
			}
		}
		System.out.println(result);
	}

}
