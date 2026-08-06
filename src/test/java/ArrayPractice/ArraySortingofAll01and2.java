package ArrayPractice;

import java.util.Arrays;

public class ArraySortingofAll01and2 {
	
	public static void main(String[] args) {
		int[] data = {1,1,0,1,2,0,2,1,0};
		//Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		int a1=0, a2=0, a3=0,a4=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]==0) {
				a1++;
			}else if(data[i]==1) {
				a2++;
			} else {
				a3++;
			}
		}
		
		for(int i=0;i<a1;i++) {
			data[a4++]=0;
		}
		for(int i=0;i<a2;i++) {
			data[a4++]=1;
		}
		for(int i=0;i<a3;i++) {
			data[a4++]=2;
		}
		
		System.out.println(Arrays.toString(data));
		
		
	}

}
