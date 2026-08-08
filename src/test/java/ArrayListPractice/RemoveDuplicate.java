package ArrayListPractice;

import java.util.ArrayList;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(1,2);
		data.add(1,4);
		data.add(1,3);
		data.add(1,4);
		data.add(1,3);
		data.add(1,4);
		System.out.println(data);
		for(int i=0;i<data.size();i++) {
			for(int j=0;j<data.size();j++) {
				if(i!=j && data.get(i)==data.get(j)) {
					data.remove(j);
				}	
		}
		}
		System.out.println(data);
	}

}
