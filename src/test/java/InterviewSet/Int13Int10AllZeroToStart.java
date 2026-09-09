package InterviewSet;

import java.util.Arrays;

public class Int13Int10AllZeroToStart {
	
	public static void main(String[] args) {
		int[] data = {0,1,2,3,0,4,2,0,1,0};
		
		System.out.println(Arrays.toString(data));
		for(int i=0;i<data.length-1;i++) {
			if(data[i]!=0) {
			for(int j=i+1;j<data.length;j++) {
				if(data[j]==0) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
					
				}
			}
		}
			}
		System.out.println(Arrays.toString(data));
	}

}
