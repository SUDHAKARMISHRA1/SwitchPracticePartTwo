package InterviewSet02;

public class StringRev010 {

	public static void main(String[] args) {
		String name = "Sudhakar";
		String rev = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		
		System.out.println(rev);
		
	}
	
}
