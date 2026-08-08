package ArrayListPractice;

import java.util.ArrayList;

public class GeneralProblem {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
	
		data.add(2);
		data.add(1,2);
		data.add(1,4);
		data.add(1,3);
		data.add(1,4);
		data.add(1,3);
		data.add(1,4);
		data.add(1,3);
		
		data.remove(2);
		
		System.out.println(data.size());
		
		System.out.println(data);
		
		System.out.println(data.contains(3));
		System.out.println(data.contains(9));
		
		ArrayList<Integer> data2 = new ArrayList<>();
		System.out.println(data2.isEmpty());
		System.out.println(data);
		for(int c: data) {
			System.out.println(c);
		}
		
		data.remove(1);
		data.add(2,4);
		System.out.println(data);
		
		data2.addAll(data);
		System.out.println(data2);
	}

}
