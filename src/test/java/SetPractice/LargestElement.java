package SetPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LargestElement {
	
	public static void main(String[] args) {
		Set<Integer> data = new HashSet<>();
		data.add(2);
		data.add(5);
		data.add(35);
		data.add(3);
		data.add(35);
		data.add(4);
		int max = 0;
		
		Iterator<Integer> it = data.iterator();
		while(it.hasNext()) {
			Integer val = it.next();
			
			if(val>=max) {
				max=val;
			}
		}
		System.out.println(max);
	}

}
