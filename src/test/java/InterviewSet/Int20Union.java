package InterviewSet;

import java.util.HashSet;
import java.util.Set;

public class Int20Union {
	
	public static void main(String[] args) {
	    int[] data1= {1,2,3,4,5,6};
        int[] data2= {1,2,3,4};
        Set<Integer> result= new HashSet<>();
        for (int i=0;i<data1.length;i++){
            result.add(data1[i]);
        }
        for(int j=0;j<data2.length;j++){
            result.add(data2[j]);
        }
        System.out.println(result);
    }
	

}
