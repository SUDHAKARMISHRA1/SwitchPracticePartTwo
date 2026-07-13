package StringPractice;

public class Palindrom {
	
	public static void main(String[] args) {
		String data = "mom";
		String rev= "";
		if(data.length()<=0) {
			System.out.println("enter valid string");
		}else {
		for(int i=data.length()-1;i>=0;i--) {
			rev = rev + data.charAt(i);
		}
		if(data.equals(rev)) {
			System.out.println("Given string is palindrom");
		} else {
			System.out.println("Given string is not palindrom");
			
		}
		}
	}

}
