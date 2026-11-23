package InterviewSet04;

import java.util.Arrays;

public class AnarStr {
	
	public static void main(String[] args) {
		String da = "listen";
		String db= "silent";
		String dalower= da.toLowerCase();
		String dblower = db.toLowerCase();
		
		char[] dasplit = dalower.toCharArray();
		char[] dbsplit = dblower.toCharArray();
		Arrays.sort(dasplit);
		Arrays.sort(dbsplit);
		boolean result = Arrays.equals(dasplit, dbsplit);
		
		if(result==true) {
			System.out.println("Given strings are anar");
		}else {
			System.out.println("Given str are not anar");
		}
		
		
	}

}
