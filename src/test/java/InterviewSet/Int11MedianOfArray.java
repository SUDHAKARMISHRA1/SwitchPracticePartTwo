package InterviewSet;

import java.util.Arrays;

public class Int11MedianOfArray {
	
	public static void main(String[] args) {
		int[] data = {3, 5, 7, 12, 19};
		Arrays.sort(data);
		if(data.length%2==0) {
			int firstIndex = (data.length/2)-1;
			int secondIndex = data.length/2;
			
			int ele1= data[firstIndex];
			int ele2= data[secondIndex];
			int avg = (ele1+ele2)/2;
			
			System.out.println("The Median of Even size array is: " +avg);
			
		}else {
			int index = data.length/2;
			System.out.println("The Median of odd size array is: " +data[index]);
			
		}
		
		
	}

}
