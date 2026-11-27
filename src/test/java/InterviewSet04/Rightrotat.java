package InterviewSet04;

import java.util.Arrays;

public class Rightrotat {
	
	public static void main(String[] args) {
		int[] data ={1,2,3,4};
		
		System.out.println(Arrays.toString(data));
		for(int i=0;i<data.length-1;i++) {
			int temp = data[i];
			data[i]=data[data.length-1];
			data[data.length-1]= temp;
		}
		System.out.println(Arrays.toString(data));
		
	}
	
	

}
