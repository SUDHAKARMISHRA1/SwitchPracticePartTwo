package InterviewSet02;

public class WordAndCharRev012 {
	
	public static void main(String[] args) {
		String text = "My name is Khan";
		String rev = "";
		String wordRev ="";
	
		System.out.println(text);
		String[] data2 = text.split(" ");
		String word;
		for(int j=0;j<=data2.length-1;j++) {
			 word =  data2[j];
			for(int k=word.length()-1;k>=0;k--) {
			wordRev= wordRev+word.charAt(k);
			}
			data2[j]=wordRev;
			wordRev="";
		}
		
		for(int i=data2.length-1;i>=0;i--) {
			rev = rev + data2[i]+" ";
		}
		System.out.println(rev);
	}

}
