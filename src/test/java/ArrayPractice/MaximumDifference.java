package ArrayPractice;

public class MaximumDifference {
	
	public static void main(String[] args) {
		int[] arr =  {23,67,1,6,97,21,7,0};
		int maxDiff=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]-arr[j]>maxDiff) {
						maxDiff=arr[i]-arr[j];
					}
				}
				
			}
		}
		System.out.println(maxDiff);
	}

}
