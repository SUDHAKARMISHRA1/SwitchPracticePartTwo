package ArrayPractice;

public class ReverceArrayElement {

	public static void main(String[] args) {
		int[] data = {2,4,6,8,0,1,1};
		int j=0;
		int[] datarev= new int[data.length];
		for(int i=data.length-1;i>=0;i--) {
		datarev[j]= data[i];
		j++;
		}
		for(int i=0;i<datarev.length;i++) {
			System.out.println(datarev[i]);
		}
	}
}
