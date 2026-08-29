package ArrayListPractice;

import java.util.ArrayList;

public class DeleteAllGreater {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(4);
		data.add(7);
		data.add(6);
		
		int check = 3;
		System.out.println(data);
		for(int i=data.size()-1;i>=0;i--) {
			if(data.get(i)>check) {
				data.remove(data.get(i));
			}
		}
		System.out.println(data);
		
		
	}

}
