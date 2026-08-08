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
		
		int n = 10;
		ArrayList<Integer> data3 = new ArrayList<>();
		for(int i=0;i<n;i++) {
			data3.add(i+1);
		}
		System.out.println(data3);
		ArrayList<Integer> data4 = new ArrayList<>();
		data4.addAll(data3);
		
		System.out.println(data2.equals(data3));
		System.out.println(data3.equals(data4));
		
		
	}

}
