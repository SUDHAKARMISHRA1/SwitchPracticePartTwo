package InterviewSet;

import java.util.Scanner;

public class Int32ScannerInput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		if(num%2==0) {
			System.out.println("The Give number is even: " +num);
		}else {
			System.out.println("The give number is odd: " +num);
		}
		
	}

}
