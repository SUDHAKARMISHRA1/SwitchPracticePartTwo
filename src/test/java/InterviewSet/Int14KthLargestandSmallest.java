package InterviewSet;

public class Int14KthLargestandSmallest {
	
	
	public static void main(String[] args) {
		int[] data = {12,34,5,6,1,8,3,4,5,6,7};
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]>=data[j]) {
					int temp = data[i];
					data[i]= data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println("Kth Largest is: " +data[data.length-3]);
		System.out.println("Kth Smallest is: " +data[3]);
		
	
		
	}

}
