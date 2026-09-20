package InterviewSet;

public class Int34StringContainOnlyChar {
	
	
	public static void main(String[] args) {
		String data= "Hello1";
		String cleanData = data.trim().toLowerCase();
		boolean flag= false;
		for(int i=0;i<cleanData.length();i++) {
			if(cleanData.charAt(i)>=97 && cleanData.charAt(i)<=122) {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Give String has Number as well");
		}else {
			System.out.println("Give String has only char");
		}
		
		
	}

}
