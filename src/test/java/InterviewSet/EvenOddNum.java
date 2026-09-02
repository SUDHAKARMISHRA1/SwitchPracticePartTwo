package InterviewSet;

import java.util.Scanner;

public class EvenOddNum {
	
	public static String checkNum(int num) {
		if(num%2==0) {
			return "even";
		}else {
			return "odd";
		}
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int num = sc.nextInt();
		
		String result = checkNum(num);
		System.out.println("Given number is " +result);
		
	}

}
