package ArrayPractice;

public class DuplicateEleInArr {

	public static void main(String[] args) {
		int[] data = {2,4,6,8,0,1,1,2};
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==data[j]) {
					System.out.println("Duplicate element is " +data[i]);
				}
			}
		}
	}
}
