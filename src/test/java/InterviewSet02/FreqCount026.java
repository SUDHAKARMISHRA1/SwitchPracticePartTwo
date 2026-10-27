package InterviewSet02;

public class FreqCount026 {
	
	public static int checkFreq(String name,Character c) {
		   if (name == null || name.length() == 0) {
	            return 0;
	        }
	
	       // Check if the first character matches 'c'
	        int count = (name.charAt(0) == c) ? 1 : 0;
	        
	        // Recursive call with the rest of the string (excluding the first character)
	        return count + checkFreq(name.substring(1), c);	
	}
	
	
	public static void main(String[] args) {
		String name = "sudhakar";
		char c = 'a';
		int charFeq= checkFreq(name,c);
		System.out.println(charFeq);
	}

}
