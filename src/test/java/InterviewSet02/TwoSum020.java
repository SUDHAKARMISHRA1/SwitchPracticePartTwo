package InterviewSet02;

public class TwoSum020 {

	public static void main(String[] args) {
		int[] data= {5,2,3,4,5,6,7};
		int sum= 5;
		boolean flag=false;
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				int pairSum= data[i]+data[j];
				if(pairSum==sum) {
					flag=true;
					System.out.println("The pair is: " +data[i] +" and " +data[j]);
				}else {
					pairSum=0;
				}
			}
			if(flag==true) {
				break;
			}
		}
		
	}
	
	
	
}
