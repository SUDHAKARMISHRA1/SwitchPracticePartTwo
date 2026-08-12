package SetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KthSmallestElement {
	

	public static void main(String[] args) {
		Set<Integer> data = new HashSet<>();
		data.add(2);
		data.add(5);
		data.add(35);
		data.add(3);
		data.add(35);
		data.add(4);
		int kth= 2;
		
		int[] arr = new int[data.size()];
		
		
		Iterator<Integer> it = data.iterator();
		int i=0;
		while(it.hasNext()) {
			 Integer val = it.next();
			 arr[i]=val;
			 i++;
		}
		Arrays.sort(arr);
		
		
		System.out.println(data);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);
	}

}
