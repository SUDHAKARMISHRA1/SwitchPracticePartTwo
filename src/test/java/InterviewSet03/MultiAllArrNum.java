package InterviewSet03;

public class MultiAllArrNum {
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		int total =1;
		
		for(int i=0;i<data.length;i++) {
			total= total * data[i];
		}
		System.out.println("The Multi of arr element is: " +total);
		
		
	}

}
