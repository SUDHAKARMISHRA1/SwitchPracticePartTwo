package InterviewSet03;

import java.util.Arrays;

public class FullRotate {


	public static void main(String[] args) {
		int[] data = {1,2,3,4,1,0};
		int count =0;
		for(int i=0;i<data.length;i++) {
			if(count<1) {
			for(int j=i+1;j<data.length;j++) {
			int temp =data[i];
			data[i]=data[j];
			data[j]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(data));
		
	}
	
}
