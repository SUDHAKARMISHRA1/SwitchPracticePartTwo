package ArrayPractice;

import java.util.Arrays;

public class LeftRotation {
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4};
		int d =1;
		int rotateCount =0;
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
			if(rotateCount<d) {
				int temp = data[i];
				data[i]= data[j];
				data[j]= temp;
				rotateCount++;
			}
			
		}
		}
		System.out.println(Arrays.toString(data));
	}

}
