package ArrayPractice;

public class FindTheMissingNumberfromSequence {
	
	public static void main(String[] args) {
		int[] arrSeq= {3,4,5,7};
		int sum=0;
		
		for(int i=0;i<arrSeq.length;i++) {
			sum = sum+arrSeq[i];
		}
		int startNum= arrSeq[0];
		int lastNum = arrSeq[arrSeq.length-1];
		int sum2=0;
		for(int i=startNum;i<=lastNum;i++) {
			sum2= sum2+i;
		}
		System.out.println("Missing num is: " +(sum2-sum));
	}

}
