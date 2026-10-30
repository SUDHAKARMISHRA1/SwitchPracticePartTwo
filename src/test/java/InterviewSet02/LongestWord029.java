package InterviewSet02;

public class LongestWord029 {
	
	public static void main(String[] args) {
		String para = "My name is Sudhakar";
		String[] data = para.split(" ");
		String Lw= data[0];
		for(int i=0;i<data.length;i++) {
			if(data[i].length()>=Lw.length()) {
				Lw=data[i];
			}
		}
		System.out.println(Lw);
	}

}
