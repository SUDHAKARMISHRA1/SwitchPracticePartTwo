package ArrayPractice;

public class MinimumIndexJumpRequired {

	public static void main(String[] args) {
		int[] data = {1,2,3,4};
		int num = 2;
		int jump=0;
		int len=data.length-1;
		for(int i=0;i<data.length;i++) {
			if(data[i]==num) {
			 jump= len-i;	
			}
		}
		System.out.println("Minimum Jump required is: "+jump);
		
	}
}
