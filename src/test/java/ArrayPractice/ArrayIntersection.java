package ArrayPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
	
	public static void main(String[] args) {
		int[] arr1= {9,4,9,8,4};
		int[] arr2= {4,9,5};
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					s.add(arr1[i]);
				}
			}
		}
		System.out.println(s);
	}

}
