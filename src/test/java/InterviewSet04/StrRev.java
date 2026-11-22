package InterviewSet04;

public class StrRev {

	public static void main(String[] args) {
		String data= "name";
		String rev ="";
		
		for(int i=data.length()-1;i>=0;i--) {
			rev = rev +data.charAt(i);
		}
		System.out.println("The rev of give data is: " +rev);
		
	}
}
