package ArrayListPractice;

import java.util.ArrayList;

public class CheckArrayListIsSorted {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(6);
		data.add(3);
		boolean flag = true;
		for(int i=0;i<data.size();i++) {
			for(int j=i+1;j<data.size();j++){
				if(data.get(i)<=data.get(j)) {
					
				}else {
					flag=false;
						System.out.println("Give arraylist is not sorted beacuse of: " +data.get(i)+" " +data.get(j));
				}
			}
		}
		if(flag==true) {
		System.out.println("Given arraylist is sorted");
		}
		
	}

}
