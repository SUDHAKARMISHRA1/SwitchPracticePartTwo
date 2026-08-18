package ArrayPractice;

public class MaximumProductOfTwoInt {
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		int max = 1;
		
		for(int i=0;i<data.length;i++) {
			int mul = 1;
			for(int j=0;j<data.length;j++) {
				if(i!=j) {
					mul= data[i]*data[j];
					if(mul>=max) {
						max=mul;
					}
				}
			}
		}
		System.out.println("Output: "+max);
	}

}
