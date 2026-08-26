package ArrayListPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> data1 = new ArrayList<>();
		data1.add(2);
		data1.add(3);
		data1.add(10);
		ArrayList<Integer> data2 = new ArrayList<>();
		data2.add(2);
		data2.add(10);
		data2.add(3);
		data2.add(9);
		
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<data2.size();i++) {
					s.add(data2.get(i));
		}
		for(int i=0;i<data1.size();i++) {
			s.add(data1.get(i));
}
		System.out.println(s);
	}

}
