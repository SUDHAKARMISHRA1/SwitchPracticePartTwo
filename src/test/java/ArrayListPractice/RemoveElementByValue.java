package ArrayListPractice;

import java.util.ArrayList;

public class RemoveElementByValue {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(1,2);
		data.add(1,4);
		data.add(1,3);
		data.add(9);
		System.out.println(data);
		int index = data.indexOf(2);
		data.remove(index);
		
		System.out.println(data);
		
	}

}
