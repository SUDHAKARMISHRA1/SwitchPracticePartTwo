package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(1,2);
		data.add(1,4);
		data.add(1,3);
		data.add(9);
		
//		for(int i=0;i<data.size();i++) {
//			for(int j=0;j<data.size()-1-i;j++) {
//			if(data.get(j)>data.get(j+1)) {
//			 int temp = data.get(j);
//			data.set(j,data.get(j+1));	
//			data.set(j+1,temp);
//			}
//			}
//		}
		System.out.println(data);
		for(int i=0;i<data.size();i++) {
			for(int j=i+1;j<data.size();j++) {
			if(data.get(i)>data.get(j)) {
				int temp = data.get(i);
				data.set(i, data.get(j));
				data.set(j,temp);
			}
			}
		}
		
		//Collections.sort(data);
		
		
		System.out.println(data);
	}
}
