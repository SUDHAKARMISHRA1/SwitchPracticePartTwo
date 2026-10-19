package InterviewSet02;

public class EvenOddIntCount0018 {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,8};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]%2==0) {
				evenCount= evenCount+1;
			}else {
				oddCount=oddCount+1;
			}
		}
		System.out.println("The even and odd count is: " +evenCount + " and "
		+oddCount +" respectively");
	}
	 
}
