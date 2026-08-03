package ArrayPractice;

import java.util.Arrays;

public class MergeTwosortedArray {
	
	public static void main(String[] args) {
		int[] arr1 = {3,2,4,1};
		int[] arr2 = {5,6,1};
		
		int[] result= new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			result[i]= arr1[i];
		}
		for(int j=0;j<=arr2.length-1;j++) {
			//System.out.println(result.length-arr1.length);
			result[result.length-arr2.length+j]=arr2[j];
		}
		
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));

		
	}

}
