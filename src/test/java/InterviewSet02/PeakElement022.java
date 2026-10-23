package InterviewSet02;

public class PeakElement022 {
	
	public static void main(String[] args) {
		  int[] data = {1, 2, 3, 4, 5, 4, 6};
	        int peakEle = data[0];
	        
	        // Loop from 0 to data.length - 1 safely
	        for (int i = 0; i < data.length; i++) {
	            
	            // Check left neighbor: true if 'i' is the first element OR greater than the left element
	            boolean checkLeft = (i == 0) || (data[i] >= data[i - 1]);
	            
	            // Check right neighbor: true if 'i' is the last element OR greater than the right element
	            boolean checkRight = (i == data.length - 1) || (data[i] > data[i + 1]);
	            
	            // If both conditions match, it's a peak
	            if (checkLeft && checkRight) {
	                peakEle = data[i];
	               // break; // Removes 'break' if you want the *last* peak (like the 6 at the end)
	            }
	        }
	        
	        System.out.println("Peak Element: " + peakEle);
	    }

}
