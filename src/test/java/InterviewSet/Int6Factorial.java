package InterviewSet;

public class Int6Factorial {
	
	public static int getFact(int num) {
		if(num==0) {
			return 1;
		}else {
			return (num * getFact(num-1));
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int num =5;
		int result = getFact(num);
		System.out.println("Factorial of num" +num +" is: " +result);
	}

}
