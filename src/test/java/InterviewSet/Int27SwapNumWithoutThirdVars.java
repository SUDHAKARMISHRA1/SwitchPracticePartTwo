package InterviewSet;

public class Int27SwapNumWithoutThirdVars {
	
	public static void main(String[] args) {
		int a =10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a and b is: " +a+ " and " +b);
	}

}
