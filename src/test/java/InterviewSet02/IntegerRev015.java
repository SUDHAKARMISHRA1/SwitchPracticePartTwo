package InterviewSet02;

public class IntegerRev015 {

	public static void main(String[] args) {
		int data = 1234;
		String value = String.valueOf(data);
		String rev = "";
		for(int i=value.length()-1;i>=0;i--) {
			rev= rev+value.charAt(i);
		}
		
		System.out.println("The reverse of given num is: " +Integer.parseInt(rev));
	}
}
