package InterviewSet;

public class Int12VowelAndCosonentCount {
	
	
	public static void main(String[] args) {
		String data = "Sudhakar";
		String cleanData = data.toLowerCase().trim();
		int vowelCount =0;
		int consoCount=0;
		
		if(data.length()==0) {
			System.out.println("Pls Enter valid String");
		}
		else {
		for(int i=0;i<data.length();i++) {
			if(cleanData.charAt(i)=='a' || cleanData.charAt(i)=='e' || cleanData.charAt(i)=='i'
					|| cleanData.charAt(i)=='o' || cleanData.charAt(i)=='u') {
				vowelCount=vowelCount+1;
			}else {
				consoCount= consoCount+1;
			}
		}
	}
		System.out.println("The vowel and consonent count in the give string is:"
				+ " " +vowelCount +" and " +consoCount+ " Respectively." );
	}

}
