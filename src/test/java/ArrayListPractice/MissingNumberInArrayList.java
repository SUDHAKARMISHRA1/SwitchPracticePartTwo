package ArrayListPractice;

import java.util.ArrayList;

public class MissingNumberInArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(2);
		data.add(4);
		data.add(5);
		data.add(6);
		int arrSize = data.size();
		int eleSum=0;
		for(int i=0;i<data.size();i++) {
			eleSum = eleSum+data.get(i);
		}
		int sum=0;
		int firstEle = data.get(0);
		int lastEle = data.get(arrSize-1);
		for(int i=firstEle;i<=lastEle;i++){
		  sum= sum+i;
		}
		System.out.println(sum);
		System.out.println(eleSum);
		int missingEle = sum-eleSum;
		System.out.println("Missing Element is: " +missingEle);
	}

}
