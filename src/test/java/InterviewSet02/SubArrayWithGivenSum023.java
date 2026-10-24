package InterviewSet02;

public class SubArrayWithGivenSum023 {
	
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6};
		int subSum = 9;
		
		for(int i=0;i<data.length;i++) {
			int arrSum=0;
			for(int j=i;j<data.length;j++) {
				arrSum += data[j];
				if(arrSum==subSum) {
					  System.out.println("Subarray found between indexes " + i + " and " + j);
	                    // To print elements:
	                    for (int k = i; k <= j; k++) {
	                        System.out.print(data[k] + " ");
	                    }
	                    System.out.println();
	                    break;
				}else if(arrSum>subSum){
					
					break;
				}
			}
			
		}
		
	}

}
