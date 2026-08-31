package InterviewSet;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseData(String inputD, int len) {
		String revData= "";
		for(int i=len-1;i>=0;i--) {
			revData= revData+inputD.charAt(i);
		}	
		return revData;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse: ");
		String inputData=sc.nextLine();
		int len = inputData.length();
		if(len<=0) {
			System.out.println("Enter Valid string data");
		}else {
		String result= reverseData(inputData, len);
		System.out.println("The reverse string of give Input" +inputData + " is: " +result);	
		}
	}
}
