package InterviewSet;

public class Int28MissingNumberFrom1ToN {
	
	
	public static void main(String[] args) {
		int totalSumofNDigit=0;
		int[] sequence = {1,2,3,4,5,6,7,9};
		int n = sequence[sequence.length-1];
		for(int i=0;i<=n;i++) {
			totalSumofNDigit = totalSumofNDigit+i;
		}
		int seqTotalSum=0;
		for(int i=0;i<sequence.length;i++) {
			seqTotalSum = seqTotalSum + sequence[i];
		}
		
		int missingElement= totalSumofNDigit-seqTotalSum;
		System.out.println("The Missing element is: " +missingElement);
	}
	

}
