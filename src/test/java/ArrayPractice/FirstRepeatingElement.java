package ArrayPractice;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		int[] data = {9,6,3,2,9,4};
		int flag=0;
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]==data[j]) {
					System.out.println("First Repeating element is: " +data[i]);
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
	}
}
