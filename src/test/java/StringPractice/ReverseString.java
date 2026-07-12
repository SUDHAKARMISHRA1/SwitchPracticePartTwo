package StringPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Sudhakar";
		String revResult= "";
		for(int i=data.length()-1;i>=0;i--) {
			revResult = revResult + data.charAt(i);
		}
		
		System.out.println("The reverse of Input is:" +revResult);
		

	}
}
