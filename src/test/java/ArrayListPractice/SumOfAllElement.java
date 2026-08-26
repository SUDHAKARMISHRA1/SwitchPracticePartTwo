package ArrayListPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumOfAllElement {
	
	public static void main(String[] args) {
		ArrayList<Integer> data2 = new ArrayList<>();
		data2.add(2);
		data2.add(10);
		data2.add(3);
		data2.add(9);
		int sum=0;
		for(int i=0;i<data2.size();i++) {
					sum = sum+data2.get(i);
		}
		System.out.println(sum);
	}

}
