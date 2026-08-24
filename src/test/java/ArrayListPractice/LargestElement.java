package ArrayListPractice;

import java.util.ArrayList;

public class LargestElement {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(2);
		data.add(10);
		data.add(3);
		data.add(9);
		System.out.println(data);
		int max = data.get(0);
		for(int i=0;i<data.size();i++) {
			for(int j=i+1;j<data.size();j++) {
				if(data.get(i)>data.get(j)) {
						max =data.get(i);
				}
			}
		}
		
		System.out.println("result: "+max);
		
		
	}

}
