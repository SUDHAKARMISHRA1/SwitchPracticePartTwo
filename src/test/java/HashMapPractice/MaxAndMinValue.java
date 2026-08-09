package HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class MaxAndMinValue {
	
	public static void main(String[] args) {
		HashMap<String, Integer> empDetail= new HashMap<>();
		empDetail.put("Rohan",10);
		empDetail.put("King",200);
		empDetail.put("Kiing",100);
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for (Map.Entry<String, Integer> entry : empDetail.entrySet()) {

            int value = entry.getValue();

            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }
        }
		
		System.out.println("Max Element is : " +max);
		System.out.println("Min Element is : " +min);
	}

}
