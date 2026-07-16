package StringPractice;

public class LengthOfString {
	
	public static void main(String[] args) {
		String data ="name";
		int len =0;
		for(char ch : data.toCharArray()) {
			len++;
		}
		System.out.println(len);
	}

}
