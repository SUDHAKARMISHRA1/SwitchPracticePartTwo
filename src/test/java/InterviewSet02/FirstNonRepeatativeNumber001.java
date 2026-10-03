package InterviewSet02;

public class FirstNonRepeatativeNumber001 {
	
	
	public static void main(String[] args) {
		int[] data = {1,4,2,3,2,3,1};
		boolean flag = false;
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==data[j]) {
					flag=false;
				}else {
					flag=true;
				}
			}
			if(flag==true) {
				System.out.println("First Non Repeative num is: " +data[i]);
				break;
			}
		}
		
		
		
	}

}
