package ArrayPractice;

import java.util.Arrays;

public class RotateRightByOnePosition {

	
	public static void main(String[] args) {
		int[] data = {2,4,6,8,0,1,1,2};
		int firstEle= data[data.length-1];
		for(int i=data.length-1;i>0;i--) {
			data[i]= data[i-1];
		}
		data[0]=firstEle;
		System.out.println(Arrays.toString(data));	
	}
}
