package ArrayPractice;

public class AverageOfarrayNum {
	
	public static void main(String[] args) {
		int[] data = {2,4,6,8,0,1,1,2};
		int average=0;
		int sum =0;
		for(int i=0;i<data.length;i++) {
			sum = sum+data[i];
			}
		average= sum/data.length;
		System.out.println(average);
		
	}
}
