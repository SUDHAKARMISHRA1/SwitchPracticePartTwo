package ArrayPractice;

public class minimumElement {

	public static void main(String[] args) {
		int[] data = {9,1,234,34,5,8};
		int minElement =data[0];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length;j++) {
				if(minElement<=data[j]) {
					
				}else {
					minElement = data[j];
				}
			}
		}
		System.out.println(minElement);
		
	}
}
