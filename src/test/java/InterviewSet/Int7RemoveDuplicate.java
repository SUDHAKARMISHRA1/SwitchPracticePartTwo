package InterviewSet;

import java.util.ArrayList;

public class Int7RemoveDuplicate {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(2);
		data.add(2);
		data.add(3);
		data.add(2);
		data.add(2);
		data.add(5);
		
		for(int i=0;i<data.size();i++) {
			for(int j=0;j<data.size();j++) {
				if(i!=j && data.get(i)==data.get(j)) {
					data.remove(data.get(j));
				}
			}
		}
		System.out.println(data);
		
	}

}
