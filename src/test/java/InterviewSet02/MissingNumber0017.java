package InterviewSet02;

public class MissingNumber0017 {

	public static void main(String[] args) {
		int[] data = {1,2,4,5};
		int dataSum= 0;
		int contSum=0;
		
		for(int i=0;i<data.length;i++) {
			dataSum = dataSum+ data[i];
		}
		int firstEle =data[0];
		int lastEle = data[data.length-1];
		for(int i=firstEle;i<=lastEle;i++) {
			contSum= contSum +i;
		}
		int missingEle = contSum-dataSum;
		System.out.println("The missing ele is: " +missingEle);
		
		
		
	}
	
}
