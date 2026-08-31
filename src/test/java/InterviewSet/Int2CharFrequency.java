package InterviewSet;

import java.util.Scanner;

public class Int2CharFrequency {

	public static int getFrequency(String input, int len, char ch) {
		int count = 0;
		for (int i = 0; i <len-1; i++) {
			if (input.charAt(i) == ch) {
				count = count + 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to find frequency from: ");
		String inputData=sc.nextLine();
		int len = inputData.length();
		if(len<=0) {
			System.out.println("Enter Valid string data");
		}else {
			System.out.println("Enter the Char to find frequency for: ");
			String inputCharStr=sc.nextLine();
			
			if(inputCharStr.length()<=0) {
				System.out.println("Enter Valid Char");
			}else {
				char ch= inputCharStr.charAt(0);
				int result= getFrequency(inputData, len,ch);
				System.out.println("The reverse string of give Input" +inputData + " is: " +result);	
			
			}
		
	}
	}

}
