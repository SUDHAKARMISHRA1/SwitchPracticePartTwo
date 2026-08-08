package ArrayListPractice;

import java.util.ArrayList;

public class ElementFrequency {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(1,2);
		data.add(1,4);
		data.add(1,3);
		data.add(1,4);
		data.add(1,3);
		data.add(1,4);
		int num =4;
		int feq=0;
		System.out.println(data);
		for(int i=0;i<data.size();i++) {
			if(data.get(i)==num) {
				feq=feq+1;
			}
		}
		System.out.println(feq);
	}

}
