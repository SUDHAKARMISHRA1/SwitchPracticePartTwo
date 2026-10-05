package InterviewSet02;

public class Palindrom002 {
	
	
	public static void main(String[] args) {
		String data= "raR ";
		String lowerCase = data.toLowerCase().trim();
		
		String rev = "";
		for(int i=lowerCase.length()-1;i>=0;i--) {
			rev= rev+lowerCase.charAt(i);
		}
		if(lowerCase.equals(rev)==true) {
			System.out.println("Give string " +lowerCase+ " is Palindrom");	
		}else {
			System.out.println("Give string " +lowerCase+ " is not Palindrom");	
		}
	}

}
