package ArrayListPractice;

import java.util.ArrayList;

public class MaxAndMinElement {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(1,2);
		data.add(1,4);
		data.add(1,3);
		data.add(9);
		System.out.println(data);
		for(int i=0;i<data.size();i++) {
			for(int j=i+1;j<data.size();j++) {
			if(data.get(i)>data.get(j)) {
				int temp = data.get(i);
				data.set(i, data.get(j));
				data.set(j, temp);
			}	
		}
		}
		System.out.println("Max Element is : " +data.get(data.size()-1));
		System.out.println("Min Element is : " +data.get(data.get(0)));
	}

}
