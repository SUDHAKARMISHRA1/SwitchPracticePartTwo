package InterviewSet03;

public class ReverseStringAll {
	
	public static void main(String[] args) {
		String name ="man";
		
		StringBuffer sb = new StringBuffer(name);
		String name01 = sb.reverse().toString();
		
		System.out.println(name01);
		
		StringBuilder sbc = new StringBuilder(name);
		String name2 =sbc.reverse().toString();
		
		System.out.println(name2);
	}

}
