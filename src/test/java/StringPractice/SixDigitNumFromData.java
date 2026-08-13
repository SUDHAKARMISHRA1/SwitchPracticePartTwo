package StringPractice;

public class SixDigitNumFromData {

	public static void main(String[] args) {
		String data = "sd sdfd sdfsdfds 123456";
		String[] arr = data.split(" ");
		for(int i=0; i<arr.length;i++) {
			String d= arr[i].toString();
			if(d.length()==6) {
				System.out.println(arr[i]);
			}
		}
	}
}
