package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListReverse {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(1,2);
		data.add(1,4);
		data.add(1,3);
		data.add(9);
		
		System.out.println(data);
		//int index=0;
		for (int i = 0; i < data.size() / 2; i++) {

		    int temp = data.get(i);

		    data.set(i, data.get(data.size() - 1 - i));

		    data.set(data.size() - 1 - i, temp);
		}
		System.out.println(data);
	}

}
