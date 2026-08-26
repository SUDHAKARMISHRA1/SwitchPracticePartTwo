package StringPractice;

import java.util.ArrayList;

public class SubSequencePractice {

	 static void printSubsequence(String data, int index, String result) {

	        if (index == data.length()) {
	            System.out.println(result);
	            return;
	        }

	        // Don't take current character
	        printSubsequence(data, index + 1, result);

	        // Take current char
	        printSubsequence(
	            data,
	            index + 1,
	            result + data.charAt(index)
	        );
	    }

	    public static void main(String[] args) {

	        String data = "ABCD";

	        printSubsequence(data, 0, "");
	    
}
	
}
