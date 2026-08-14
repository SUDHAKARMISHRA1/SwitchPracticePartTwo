package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductofEachExceptSelf {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int mul=1;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					 mul = mul*arr[j];
				}
				result[i]= mul;
				
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
