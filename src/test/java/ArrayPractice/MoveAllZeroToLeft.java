package ArrayPractice;

import java.util.Arrays;

public class MoveAllZeroToLeft {
	
	public static void main(String[] args) {
		int[] data = {0,2,3,0,3,0};
		for(int i=0;i<data.length-1;i++) {
			if(data[i]==0) {
					for(int j=i+1;j<data.length-1;j++) {
						if(data[j]!=0) {
							int temp = data[i];
							data[i]=data[j];
							data[j]=temp;
						}
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}

}
