package StringPractice;

import java.util.Arrays;

public class AnargamsFromListofWords {
	
	public static void main(String[] args) {
		String data = "earth heart ram arm jail lai what tha";
		String[] val = data.split(" ");
		for(int i=0;i<val.length;i++) {
			for(int j=i+1;j<val.length;j++) {
				String val1 = val[i];
				String val2 = val[j];
				String cleanone = val1.replaceAll("\\s", "").toLowerCase();
				String cleantwo = val2.replaceAll("\\s", "").toLowerCase();
				
				if(cleanone.length()==cleantwo.length()) {
					char[] c1 = cleanone.toCharArray();
					char[] c2 = cleantwo.toCharArray();
					Arrays.sort(c1);
					Arrays.sort(c2);
					if(Arrays.equals(c1, c2)== true){
						System.out.println("Given string are anargams: " +val1 +" and " +val2);
					}
				}
				
				
			}
		}
	}

}
