package InterviewSet02;

import java.util.Arrays;

public class Anargams003 {
	
	
	public static boolean checkAnargam(String d1, String d2) {
		String cleanD1= d1.toLowerCase().trim();
		String cleanD2= d2.toLowerCase().trim();
		
		char[] charD1 = cleanD1.toCharArray();
		char[] charD2 = cleanD2.toCharArray();
		
		Arrays.sort(charD1);
		Arrays.sort(charD2);
		
		return Arrays.equals(charD1, charD2);
	}
	
	public static void main(String[] args) {
		String d1= "listen";
		String d2 = "Silent";
		
		if(d1.length()!=d2.length()) {
			System.out.println("Give two String " +d1+ " and " +d2+ " are not Anargams");
			
		}else {
			boolean result = checkAnargam(d1,d2);
			if(result==true) {
				System.out.println("Give two String " +d1+ " and " +d2+ " are Anargams");
			}else {
				System.out.println("Give two String " +d1+ " and " +d2+ " are not Anargams");
			}
			
				
		}
	}

}
