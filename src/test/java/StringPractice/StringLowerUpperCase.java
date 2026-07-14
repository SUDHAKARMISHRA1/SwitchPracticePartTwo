package StringPractice;

public class StringLowerUpperCase {
	
	public static void main(String[] args) {
		String data = "He3llo1";
		String result= "";
		String temp="";
		if(data.length()<=0) {
			System.out.println("Pls enter valid string");
		}else {
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)>=97 && data.charAt(i)<123) {
				//System.out.println(data.charAt(i));
				 temp = String.valueOf(data.charAt(i)).toUpperCase();
				 
				result = result + temp;
				//System.out.println(result);
			}else if(data.charAt(i)>=65 && data.charAt(i)<91) {
				 temp = String.valueOf(data.charAt(i)).toLowerCase();;
				 System.out.println(temp);
					result = result + temp;
			}else {}
		}
		System.out.println(result);
	}
	}

}
