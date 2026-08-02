package ArrayPractice;

public class EvenAndOddCount {
	
	public static void main(String[] args) {
		int[] data = {2,4,6,8,0,1,1};
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0;i<data.length;i++) {
			if(data[i]%2==0 && data[i]!=0) {
				evenCount = evenCount+1;
			}else if(data[i]==0){
				
			}else {
				oddCount= oddCount+1;
			}
		}
		System.out.println("Even count is: " +evenCount +" and odd count is: " +oddCount);
	}

}
