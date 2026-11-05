package InterviewSet03;

public class MinMax {
	
	public static void main(String[] args) {
		int[] data = {1,2,3,8,9,4,5,6,7};
		int min =0;
		int max=0;
		
		for(int i=0;i<data.length;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i]>=data[j]) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		min= data[0];
		max=data[data.length-1];
		System.out.println(min+" and "+max);
		
		
		
	}

}
