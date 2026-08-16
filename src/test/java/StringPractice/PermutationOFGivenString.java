package StringPractice;

public class PermutationOFGivenString {
	
	 public static void main(String[] args) {

	        String str = "ABC";

	        generatePermutations(str, "");
	    }

	    static void generatePermutations(String str, String result) {

	        // Base condition
	        if (str.length() == 0) {
	            System.out.println(result);
	            return;
	        }

	        // Pick each character one by one
	        for (int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            // Remove selected character
	            String remaining = str.substring(0, i)
	                               + str.substring(i + 1);

	            // Recursive call
	            generatePermutations(remaining, result + ch);
	        }
	    }

}
