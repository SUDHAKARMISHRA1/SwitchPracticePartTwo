package InterviewSet02;

public class WordCount027 {
	
	public static void main(String[] args) {
		String para = "This is my name and it is good";
		String data = para.trim();
		int count =0;
		for(int i=0;i<data.length();i++) {
			char cc = data.charAt(i);
			if(cc==' ') {
				count=count +1;
			}
		}
		System.out.println(count+1);
		
	}

}
