package InterviewSet;

import java.util.Scanner;

public class Int3Palindrome {

	 public static boolean checkPalindrome(String data,int len){
	        String rev= "";
	        for(int i=len-1;i>=0;i--){
	            rev= rev+data.charAt(i);
	        }
	        if(rev.equals(data)){
	            return true;
	        }else{
	            return false;
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String to check:");
	        String data=sc.nextLine();
	        int len = data.length();

	        if(len<=0){
	            System.out.println("Ple Enter valid String");
	        }else{
	            boolean result= checkPalindrome(data,len);
	            if(result==true){
	                System.out.println("Given String is palindrome");
	            }else{
	                System.out.println("Given String is not palindrome");
	            }
	        }
	    }
}
