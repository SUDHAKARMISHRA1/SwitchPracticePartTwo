package StringPractice;

public class VowelCount {
	
	public static void main(String[] args) {
		String data = "aaeiousddgsd";
		String cleanData= data.toLowerCase();
		int vCount = 0;
		if(data.length()<=0) {
			System.out.println("pls enter valid string");
		}else {
			for(int i=0;i<cleanData.length();i++) {
				if(cleanData.charAt(i)== 'a' || cleanData.charAt(i)=='e'|| cleanData.charAt(i)=='i'
						|| cleanData.charAt(i)=='o' || cleanData.charAt(i)=='u') {
					vCount = vCount+1;
				}
			}
			System.out.println("Vowel count in given string is: " +vCount);
		}
	}

}
