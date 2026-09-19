package InterviewSet;

public class Int23PairSumEqualToGiveNum {
	
	
	public static void main(String[] args) {
		int[] data = {1,2,50,48,50,50,100};
		int target=100;
		int sum =0;
		boolean flag=false;
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				sum = data[i]+data[j];
				if(sum==target) {
					flag = true;
					System.out.println("The pair is " +data[i] +" and " +data[j]);
					break;
				}
			}
			if(flag==true) {
				break;
			}
		}
		
		
		
	}

}
