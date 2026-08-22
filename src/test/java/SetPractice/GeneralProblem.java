package SetPractice;

import java.util.HashSet;
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
	}

}
