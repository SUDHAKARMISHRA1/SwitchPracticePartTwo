package ArrayPractice;

import java.util.Arrays;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		int[] data =  {2,4,1,5,6};
		Arrays.sort(data);
		System.out.println(data[data.length-2]);
	}

}
