package HashMapPractice;

import java.util.HashMap;

public class GeneralPractice {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> empDetail= new HashMap<>();
		empDetail.put(1, "Rohan");
		empDetail.put(2, "King");
		empDetail.put(3, "Kiing");
		
		System.out.println(empDetail);
		
		System.out.println(empDetail.get(2));
		System.out.println(empDetail.containsKey(1));
		System.out.println(empDetail.containsKey(3));
		System.out.println(empDetail.containsValue("Rohan"));
		System.out.println(empDetail.containsValue("king"));
		empDetail.remove(3);
		System.out.println(empDetail);
		
		
		
		
	}

}
