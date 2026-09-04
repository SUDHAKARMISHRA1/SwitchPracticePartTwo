package InterviewSet;

public class Int8Palindrom {

	public static void main(String[] args) {
		int a = 121;
		int rev = 0;
		int temp;

		temp = a;
		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;

		}
		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
