package InterviewSet;

import java.util.Arrays;

public class Int29ArraySorting {
	
	public static void main(String[] args) {
		int[] data = {3,4,2,1,31,2,3,4,5};
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]<=data[j]) {
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
		
	}

}
