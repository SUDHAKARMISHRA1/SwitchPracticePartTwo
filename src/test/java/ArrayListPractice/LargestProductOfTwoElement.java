package ArrayListPractice;

import java.util.ArrayList;

public class LargestProductOfTwoElement {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(4);
		data.add(5);
		data.add(6);
		
		int max = 1;
		
		for(int i=0;i<data.size();i++) {
			int mul = 1;
			for(int j=0;j<data.size();j++) {
				if(i!=j) {
					mul= data.get(i)*data.get(j);
					if(mul>=max) {
						max=mul;
					}
				}
			}
		}
		System.out.println("Output: "+max);
	
		
	}

}
