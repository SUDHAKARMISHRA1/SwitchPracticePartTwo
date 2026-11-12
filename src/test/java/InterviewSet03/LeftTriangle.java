package InterviewSet03;

public class LeftTriangle {
	
	 public static void main(String[] args) {
	        int rows = 5; // Change this value to adjust the height of the triangle

	        // Outer loop handles the number of rows
	        for (int i = 1; i <= rows; i++) {
	            
	            // Inner loop 1: Prints the leading spaces for right alignment
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  "); // Two spaces match the width of "* "
	            }
	            
	            // Inner loop 2: Prints the actual stars
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            
	            // Moves the cursor to a new line after completing a row
	            System.out.println();
	        }
	    }

}
