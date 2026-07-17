package StringPractice;

public class ReplaceStringWithGivenChar {

	public static void main(String[] args) {
		String data =" Hell o my n i is j  ";
		char ch = 'D';
		if(data.length()<=0) {
			System.out.println("Pls enter valid string");
		}else {
		String result = data.replaceAll(" ", String.valueOf(ch));
		System.out.println(result);
		}
	}
}
