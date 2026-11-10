package InterviewSet03;

public class ConcatAllChar {
	
	public static void main(String[] args) {
		Character[] data = {'s','u','d','h','a','k','a','r'};
		String result="";
		
		for(int i=0;i<data.length;i++) {
			result= result+data[i];
		}
		
		System.out.println("Concatenation of all char is: " +result);
		
	}

}
