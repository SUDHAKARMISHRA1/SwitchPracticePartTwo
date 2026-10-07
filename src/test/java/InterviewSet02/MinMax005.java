package InterviewSet02;

public class MinMax005 {
	
	public static void main(String[] args) {
		int[] data = {6,7,1,2,3,4,5};
		//1st ways
//		Arrays.sort(data);
//		int min = data[0];
//		int max = data[data.length-1];
//		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]>=data[j]) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		int min = data[0];
		int max = data[data.length-1];	
		System.out.println(min);
		System.out.println(max);
	}

}
