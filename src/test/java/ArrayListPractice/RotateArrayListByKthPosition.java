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
	}

}
