package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(1,2);
		data.add(1,4);
		data.add(1,3);
		data.add(9);
		
		Integer[] arr = data.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));
	}

}
