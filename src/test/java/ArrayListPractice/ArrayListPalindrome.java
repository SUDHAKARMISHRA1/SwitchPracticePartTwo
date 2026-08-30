package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListPalindrome {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(2);
		data.add(1);
		int j= 0;
		
		ArrayList<Integer> rev = new ArrayList<>();
		for(int i=data.size()-1;i>=0;i--) {
				rev.add(j,data.get(i));
				j++;		
		}
		
		
		if(data.equals(rev)) {
		System.out.println(data +" is Palindrom");
		}else {
			System.out.println(data +" is Not Palindrom");
		}
		
	
	}

}
