package SetPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetContainElementofOtherSet {
	
	public static void main(String[] args) {
		Set<Integer> data = new HashSet<>();
		data.add(2);
		data.add(5);
		data.add(15);
		data.add(3);
		data.add(4);
		Set<Integer> data2 = new HashSet<>();
		data2.add(1);
		data2.add(99);
		data2.add(2);
		data2.add(3);
		data2.add(6);
	
		Iterator<Integer> it = data.iterator();
		while(it.hasNext()) {
			 Integer val = it.next();
			 if(data2.contains(val)) {
				 System.out.println("Yes data2 contain value: " +val);
			 }
			
		}
		
	}

}
