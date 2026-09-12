package InterviewSet;

public class Int16Armstrong {
	
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
	        int sum = 0;
	        
	        // Find the total number of digits
	        int digits = String.valueOf(num).length();
	        
	        // Process each digit
	        while (num > 0) {
	            int lastDigit = num % 10; // Extract the last digit
	            sum += Math.pow(lastDigit, digits); 
	            // Raise to the power of digits and add to sum
	            num /= 10; // Remove the last digit
	        }
	   
	        if(temp==sum) {
	        	System.out.println("Give num is armstrong");
	        }else {
	        	System.out.println("Give num is not armstrong");
	        }
		
	}

}
