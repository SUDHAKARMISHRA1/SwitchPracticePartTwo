package InterviewSet03;

public class AddAllArrNum {
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		int total =0;
		
		for(int i=0;i<data.length;i++) {
			total= total+data[i];
		}
		System.out.println("The sum of arr element is: " +total);
		
		
	}

}
