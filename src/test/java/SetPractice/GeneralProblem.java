package SetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GeneralProblem {
	
	
	public static void main(String[] args) {
		Set<Integer> data = new HashSet<>();
		data.add(2);
		data.add(4);
		data.add(0);
		data.add(8);
		data.add(6);
		System.out.println(data);
		data.remove(0);
		System.out.println(data);
		
		//Set contain elements
		System.out.println(data.contains(3));
		System.out.println(data.contains(2));
		
		System.out.println(data.size());
		
		data.clear();
		
		System.out.println(data);
		
		System.out.println(data.isEmpty());
		Set<Integer> data2 = new HashSet<>();
		data2.add(2);
		data2.add(4);
		data2.add(0);
		data2.add(8);
		data2.add(6);
		
		Set<Integer> data3 = new HashSet<>();
		data3.add(2);
		data3.add(4);
		data3.add(0);
		data3.add(8);
		data3.add(6);
		
		Object[] add= data2.toArray();
		System.out.println(add[2]);
		
		
		System.out.println(data.equals(data2));
		System.out.println(data2.equals(data3));
		
		data3.addAll(data2);
		System.out.println(data3.size()==data2.size());
		
		Iterator<Integer> it = data3.iterator();
		while(it.hasNext()) {
			int val = it.next();
			System.out.println(val);
		}
		
		
		
	}

}
