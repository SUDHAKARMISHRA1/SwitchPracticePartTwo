package StringPractice;

public class CheckIfstringIsValidNumber {

	
	public static void main(String[] args) {
		String data = ".";
		if(data.length()<=0) {
			System.out.println("pls enter valid string");
		}
		else {
			boolean result= true;
			for(int i=0;i<data.length();i++) {
				
				if(data.charAt(i)>=47 && data.charAt(i)<=57 || data.charAt(i)==46) {
					result = true;
				}else {
					result = false;
					break;
				}
				
			}
			if(result ==true) {
				System.out.println("Given string is valid number");
			}else {
				System.out.println("Not a valid num");
			}
		}
	}
}
