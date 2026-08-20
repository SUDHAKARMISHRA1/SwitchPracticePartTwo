package ArrayPractice;

import java.util.ArrayList;

public class ArraySumEqualTo100 {
	
	public static void main(String[] args) {
		int[] data = {10,10,30,60,10};
		ArrayList<Integer> num = new ArrayList<>();
		int target=100;
		boolean found;
		for(int i=0;i<data.length;i++) {
			int sum=0;
			for(int j=0;j<=data.length-1;j++) {
				if(i!=j) {
					sum= sum+data[j];
					if(sum<target) {
						num.add(data[j]);
					}else if(sum==target) {
						num.add(data[j]);
						found=true;
						break;
					}
				}
				
			}
			if(found=true) {
				System.out.println(num);
				break;
			}
		}
		
	}

}
