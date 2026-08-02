package ArrayPractice;

import java.util.Arrays;

public class RotateArrayByOnePosition {
	
	public static void main(String[] args) {
		int[] data = {2,4,6,8,0,1,1,2};
		int firstEle= data[0];
		for(int i=0;i<data.length-1;i++) {
		data[i]= data[i+1];
		}
		data[data.length-1]=firstEle;
		System.out.println(Arrays.toString(data));	
	}
}
