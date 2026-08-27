package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MaxOccuranceElement {
	
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
		Iterator<Integer> it = res.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			int val= res.get(key);
			if(max<val) {
				max=val;
			}else {
				max=0;
			}
		}
		System.out.println(max);
	}

}
