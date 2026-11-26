package InterviewSet04;

public class Palin {
	
	public static void main(String[] args) {
		String data = "mom";
		String rev ="";
		for(int i=data.length()-1;i>=0;i--) {
			rev= rev+data.charAt(i);
		}
		
		if(data.equals(rev)==true) {
			System.out.println("given string is palin");
		}else {
			System.out.println("Give str is not palin");
		}
	}

}
