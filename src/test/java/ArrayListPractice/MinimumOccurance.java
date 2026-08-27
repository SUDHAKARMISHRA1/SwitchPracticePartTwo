package ArrayListPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinimumOccurance {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(2);
		data.add(4);
		data.add(3);
		data.add(4);
		data.add(3);
		data.add(4);
		int max=0;
		int temp=0;
		HashMap<Integer,Integer> res= new HashMap<>();
		System.out.println(data);
		for(int i=0;i<data.size();i++) {
				if(res.containsKey(data.get(i))==true) {
					res.put(data.get(i), res.get(data.get(i))+1);
				}else {
					res.put(data.get(i), 1);
				
			}
		}
		System.out.println(res);
		int minCount = Integer.MAX_VALUE;
		for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() < minCount) {
            	minCount = entry.getValue();
            }
        }
		System.out.println(minCount);
	}
	


}
