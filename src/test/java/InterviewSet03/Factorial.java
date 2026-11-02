package InterviewSet03;

public class Factorial {

	public static int getFact(int data) {
		
		if(data==0) {
			return 1;
		}
		return data * getFact(data-1);
		
	}
	
	
	public static void main(String[] args) {
		int data =5;
		
		int fact = getFact(data);
		System.out.println(fact);
	}
	
}
