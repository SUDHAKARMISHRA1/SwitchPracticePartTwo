package InterviewSet02;

import java.util.Arrays;

public class AllZeroToEnd019 {

	public static void main(String[] args) {
		int[] data = {0,1,2,3,0,0,1,0};
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==0) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
	
}
