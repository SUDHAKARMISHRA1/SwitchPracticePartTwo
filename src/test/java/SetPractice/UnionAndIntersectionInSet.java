package SetPractice;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionInSet {
	
	
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
		data2.toArray();
		Set<Integer> union = new HashSet<>(data2);
		union.addAll(data);
		System.out.println(union);
		

		
	}

}
