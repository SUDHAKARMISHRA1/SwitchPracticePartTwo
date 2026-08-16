package StringPractice;

public class ReverseWord {
	
	public static void main(String[] args) {
		String data = "My name is khan";
		String result = "";
		String[] arr = data.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			result = result +" "+ arr[i];
		}
		System.out.println(result);
	}

}
