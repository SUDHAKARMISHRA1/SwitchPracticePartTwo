package StringPractice;

public class FirstNonRepeatingChar {
	
	public static void main(String[] args) {
		String data = "aaebcb";

		if(data.length()<=0) {
			System.out.println("Enter valid string");
		}
		else {
		for(int i =0; i<data.length();i++) {
			boolean flag = false;
			for(int j=0;j<data.length();j++) {
				if(i!=j && data.charAt(i)==data.charAt(j)) {
					System.out.println("Char at" +data.charAt(i) +data.charAt(j));
					flag = true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("First Non Repating char is: " +data.charAt(i));
			break;
			}
		}
	}
	}

}
