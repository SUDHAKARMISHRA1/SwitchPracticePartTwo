package InterviewSet02;

public class SecondLargest0016 {

	public static void main(String[] args) {
		int[] data= {1,3,2,4,6,5,7};
		
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]>=data[j]) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		System.out.println("The second largest element is: " +data[data.length-2]);
		
	}
}
