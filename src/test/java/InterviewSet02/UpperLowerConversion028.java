package InterviewSet02;

public class UpperLowerConversion028 {
	
	public static void main(String[] args) {
		String name = "SudhakaR";
		String name2= "";
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>=65 &&name.charAt(i)<=90) {
				Character c = Character.toLowerCase(name.charAt(i));
				name2= name2+c;
				
			}else {
				Character s= Character.toUpperCase(name.charAt(i));
				name2= name2+s;
			}
		}
		System.out.println("The conversion from " +name +" is " +name2);
	}

}
