package InterviewSet;

public class Int21MaxDiff {
	
	public static void main(String[] args) {
		 int[] data= {1,2,3,7,4,5,6};
	     int maxDiff=0;
	     
	     for(int i=0;i<data.length;i++) {
	    	 for(int j=0;j<data.length;j++) {
	    		 if(i!=j) {
	    			int diff=data[i]-data[j];
	    			if(maxDiff<diff) {
	    				maxDiff=diff;
	    			}
	    		 }
	    	 }
	     }
	        System.out.println(maxDiff);
	        
	        
	}

}
