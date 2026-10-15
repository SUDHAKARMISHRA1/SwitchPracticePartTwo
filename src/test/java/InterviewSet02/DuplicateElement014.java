package InterviewSet02;

public class DuplicateElement014 {
	
	public static void main(String[] args) {
		int[] data = {1,2,3,4,4,1};
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==data[j]) {
					System.out.println(data[i] +" is duplicate element in given array.");
				}
			}
		}
	}

}
