package ArrayPractice;

public class SumOfArrElement {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,0,-1};
		int sum = 0;
		for(int i=0;i<data.length;i++) {
			sum = sum + data[i];
		}
		System.out.println(sum);
	}
}
