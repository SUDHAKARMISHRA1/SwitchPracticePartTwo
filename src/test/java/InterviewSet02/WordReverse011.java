package InterviewSet02;

public class WordReverse011 {
	
	public static void main(String[] args) {
		String para = "My name is Khan";
		String rev = "";
		String[] data = para.split(" ");
		for(int i=data.length-1;i>=0;i--) {
			rev= rev +data[i]+" ";
		}
		System.out.println(rev);
		
	}

}
