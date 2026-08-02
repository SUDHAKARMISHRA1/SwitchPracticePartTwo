package ArrayPractice;

public class maximumElement {
	
	public static void main(String[] args) {
		int[] data = {23,3,4,54,2,56};
		int maxElement = data[0];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length;j++) {
				if(maxElement>=data[j]) {		
				}else {
					maxElement = data[j];
				}
			}
		}
		System.out.println(maxElement);
	}

}
