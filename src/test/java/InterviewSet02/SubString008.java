package InterviewSet02;

import java.util.ArrayList;

public class SubString008 {
	
	public static void main(String[] args) {
		String data = "abcd";
		
		ArrayList<String> result = new ArrayList<>();
		for(int i=0;i<data.length();i++) {
			for(int j=i+1;j<=data.length();j++) {
			 result.add(data.substring(i,j));
			 }
		} 
		 System.out.println(result);
		
	}

}
