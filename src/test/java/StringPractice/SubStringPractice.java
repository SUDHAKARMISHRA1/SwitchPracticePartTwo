package StringPractice;

public class SubStringPractice {
	
	public static void main(String[] args) {
		String data = "abcd";
		//all substring
		int subStringCount = 0;
		for(int i=0;i<data.length();i++) {
			for(int j=i+1;j<=data.length();j++) {
				subStringCount++;
				System.out.println(data.substring(i,j));
			}			
		}
		//SubString count
		System.out.println("Total Substring count are: " +subStringCount);
		
		
		
	}

}
