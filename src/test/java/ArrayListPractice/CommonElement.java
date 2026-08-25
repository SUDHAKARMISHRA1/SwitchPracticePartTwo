package ArrayListPractice;

import java.util.ArrayList;

public class CommonElement {
	
	public static void main(String[] args) {
		ArrayList<Integer> data1 = new ArrayList<>();
		data1.add(2);
		data1.add(3);
		data1.add(10);
		ArrayList<Integer> data2 = new ArrayList<>();
		data2.add(2);
		data2.add(10);
		data2.add(3);
		data2.add(9);
		
		for(int i=0;i<data2.size();i++) {
			for(int j=0;j<data1.size();j++) {
				if(data2.get(i)==data1.get(j)) {
					System.out.println(data2.get(i)+" Is common element");
				}
			}
		}
		
		
	}

}
