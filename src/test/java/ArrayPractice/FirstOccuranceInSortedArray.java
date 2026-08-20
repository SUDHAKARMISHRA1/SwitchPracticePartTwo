package ArrayPractice;

public class FirstOccuranceInSortedArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4,5};
		int target = 4;
		
		  int low = 0;
	        int high = arr.length - 1;
	        int result = -1; // Default if target is not found

	        while (low <= high) {
	            // Avoid potential integer overflow
	            int mid = low + (high - low) / 2; 

	            if (arr[mid] == target) {
	                result = mid;       // Record the potential first occurrence
	                high = mid - 1;     // Keep searching to the left
	            } else if (arr[mid] > target) {
	                high = mid - 1;     // Target is in the left subarray
	            } else {
	                low = mid + 1;      // Target is in the right subarray
	            }
	        }
	       System.out.println(result);
		
		
	}

}
