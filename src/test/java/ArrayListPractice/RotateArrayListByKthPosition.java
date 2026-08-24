package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotateArrayListByKthPosition {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(2);
		data.add(10);
		data.add(3);
		data.add(9);

		System.out.println(data);
		Collections.rotate(data, -1);
		System.out.println(data);	
		
		ArrayList<Integer> data2 = new ArrayList<>();
		data2.add(2);
		data2.add(2);
		data2.add(10);
		data2.add(3);
		data2.add(9);
		System.out.println(data2);
		Collections.rotate(data2, 1);
		System.out.println(data2);
	}

}
