package SetPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveAllElementFromOneHashsetifPresentInTwo {

	
	public static void main(String[] args) {
		Set<Integer> data2 = new HashSet<>();
		data2.add(2);
		data2.add(4);
		data2.add(0);
		data2.add(8);
		data2.add(6);
		
		Set<Integer> data = new HashSet<>();
		data.add(2);
		data.add(4);
		data.add(9);
		
		Object[] one = data2.toArray();
		
		for(int i=0;i<data2.size();i++) {
			if(data.contains(one[i])==true) {
				System.out.println(one[i]);
				data2.remove(one[i]);
			}
		}
		System.out.println(data2);
	}
}
