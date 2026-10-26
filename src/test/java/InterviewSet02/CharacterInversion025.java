package InterviewSet02;

public class CharacterInversion025 {
	

	
	public static void main(String[] args) {
		String data = "Hello World";
		String rev= "";
		String[] sdata = data.split(" ");
		for(int i=sdata.length-1;i>=0;i--) {
				rev=rev+sdata[i]+" ";
		}
		System.out.println(rev.trim());
		
		
	}

}
