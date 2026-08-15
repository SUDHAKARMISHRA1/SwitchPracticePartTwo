package StringPractice;

public class SubStringPractice {
	
	public static void main(String[] args) {
		String data = "abcd";
		String inputSubstring = "cd";
		//all substring
		int subStringCount = 0;
		for(int i=0;i<data.length();i++) {
			for(int j=i+1;j<=data.length();j++) {
				subStringCount++;
			//	System.out.println(data.substring(i,j));
			}			
		}
		//SubString count
		System.out.println("Total Substring count are: " +subStringCount);
		
		//string is substring of other
		for(int i=0;i<data.length();i++) {
			for(int j=i+1;j<=data.length();j++) {
				if(data.substring(i,j).equals(inputSubstring)) {
					System.out.println("Given string is substring or other");
				}
			}			
		}
		
		
	}

}
