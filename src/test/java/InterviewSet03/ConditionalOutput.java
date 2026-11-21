package InterviewSet03;

import java.util.Scanner;

public class ConditionalOutput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input== 1) {
			System.out.println("You have first options");
		}else if(input == 2) {
			System.out.println("you have second options");
		}else {
			System.out.println("Try next time");
		}
	}

}
