package InterviewSet;

import java.util.Arrays;

public class Int18MultipleExceptSelf {
	
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		int[] result = new int[data.length];
		
		System.out.println(Arrays.toString(data));
		for(int i=0;i<data.length;i++) {
			int mul=1;
			for(int j=0;j<data.length;j++) {
				if(i!=j) {
					mul=mul*data[j];
				}
			}
			result[i]=mul;
			mul=1;
		}
		System.out.println(Arrays.toString(result));
		
	}

}
