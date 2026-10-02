package InterviewSet;

import java.util.Arrays;

public class Int003RotateRight {
	
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		int k=3;
		int firstEle=data[0];
		System.out.println(Arrays.toString(data));
		for(int j=1;j<=k;j++) {
		 firstEle=data[0];
		for(int i=0;i<data.length-1;i++) {
			data[i]=data[i+1];
		}
		data[data.length-1]=firstEle;
		}
		
		System.out.println(Arrays.toString(data));
		
	}

}
