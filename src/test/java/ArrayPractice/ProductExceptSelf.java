package ArrayPractice;

import java.util.Arrays;

public class ProductExceptSelf {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int temp =1;
			for(int j=0;j<arr.length;j++) {
				
				if(i!=j) {
					temp = temp*arr[j];
					}
			}
			result[i]=temp;
		}
		System.out.println(Arrays.toString(result));
		
		
	}

}
