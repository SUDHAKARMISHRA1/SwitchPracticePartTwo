package InterviewSet02;

public class SearchValue021 {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6};
		int checkValue =5;
		for(int i=0;i<data.length;i++) {
			if(data[i]==checkValue) {
				System.out.println("The index of value is: " +i);
			}
		}
		
	}
}
