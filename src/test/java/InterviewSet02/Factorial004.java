package InterviewSet02;

public class Factorial004 {
	
	public static int getFact(int num) {
		if(num==0) {
			return 1;
		}
		return num*getFact(num-1);
	}
	
	public static void main(String[] args) {
		
		int num = 5;
		int result = getFact(num);
		System.out.println(result);
	}

}
