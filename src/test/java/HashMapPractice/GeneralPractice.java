package HashMapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
		empDetail.put(2, "Me");
		System.out.println(empDetail);
		System.out.println(empDetail.size());
		
		for(Map.Entry<Integer,String> c: empDetail.entrySet()) {
			System.out.println(c.getKey()+" : "+c.getValue());
		}
		
		Iterator<Integer> it = empDetail.keySet().iterator();
		while(it.hasNext()) {
			int key= it.next();
			String value = empDetail.get(key);
			System.out.println("Key is: " +key + " and Value is: "+value);
		}
		
		empDetail.clear();
		System.out.println("Data is:" +empDetail);
		System.out.println(empDetail.isEmpty());
		
		
		HashMap<Integer, String> empDetail1= new HashMap<>();
		empDetail1.put(1, "Rohan");
		empDetail1.put(2, "King");
		empDetail1.put(3, "Kiing");
		
		HashMap<Integer, String> empDetail2= new HashMap<>();
		empDetail2.put(4, "Rohan2");
		empDetail2.put(5, "King2");
		empDetail2.put(3, "Kiing2");
		
		empDetail1.putAll(empDetail2);
		System.out.println(empDetail1);
		
		
		
	}

}
