package StringPractice;

public class CheckStringisRotationOfOtherString {

	public static void main(String[] args) {
		String data1 = "abcd";
		String data2= "dabc";
		String temp = data1+data1;
		if(data1.length() != data2.length()) {
			System.out.println("not rotation of data2");
		} else {
		if(temp.contains(data2)) {
			System.out.println("data2 is rotation of data1");
		}else {
			System.out.println("not");
		}
		}
	
		}
		
}
