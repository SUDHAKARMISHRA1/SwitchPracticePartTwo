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
		
		//find ele which is in one but not in two
		for(int i=0;i<data2.size();i++) {
			if(data.contains(one[i])==false) {
				System.out.println("Missing are: "+one[i]);
			}
		}
		
		
		
		//remove if ele of one present in two
		for(int i=0;i<data2.size();i++) {
			if(data.contains(one[i])==true) {
				data2.remove(one[i]);
			}
		}
		System.out.println(data2);
	}
}
