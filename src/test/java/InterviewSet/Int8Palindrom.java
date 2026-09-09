package InterviewSet;

public class Int8Palindrom {
	
	public static boolean checkPalindrom(int num) {
		int rev= 0;
		int temp=num;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num= num/10;
		}
		if(temp==rev) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		int data =121;
		boolean result =checkPalindrom(data);
		if(result==true) {
			System.out.println("The Given Num is Palindrom");
		}else {
			System.out.println("Given num is not palindrom");
		}
		
		
		
		
//		int a = 121;
//		int rev = 0;
//		int temp;
//
//		temp = a;
//		while (a != 0) {
//			rev = rev * 10 + a % 10;
//			a = a / 10;
//
//		}
//		if (temp == rev) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Not a Palindrome");
//		}

	}

}
