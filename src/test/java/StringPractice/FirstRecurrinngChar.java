package StringPractice;

public class FirstRecurrinngChar {
	
	public static void main(String[] args) {
		String data = "shjghj";
		boolean flag = false;
		for(int i=0;i<data.length();i++) {
			for(int j=i+1;j<data.length();j++) {
				if(data.charAt(i)==data.charAt(j)) {
					System.out.println("The first recurring char is " +data.charAt(i));
					flag = true;
				}
				if(flag== true) {
					break;
				}
			}
		}
	}

}
