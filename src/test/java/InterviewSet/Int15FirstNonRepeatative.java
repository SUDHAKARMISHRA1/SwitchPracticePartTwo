package InterviewSet;

public class Int15FirstNonRepeatative {
	
	public static void main(String[] args) {
		int[] data = {1,2,1,3,2,4,5,1};
		
		for(int i=0;i<data.length;i++) {
			boolean flag= false;
			for(int j=0;j<data.length;j++) {
				if(i!=j && data[i]==data[j]) {
					flag=false;
					break;
				}else {
					flag=true;
				}
			
		}
	
			if(flag==true) {
				System.out.println("The first Non Rep is: " +data[i]);
				break;
			}
		}
		
	}

}
