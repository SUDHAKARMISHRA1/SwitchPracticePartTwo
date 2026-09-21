package InterviewSet;

public class Int25StringContainOnlydigit {
	
	
	public static void main(String[] args) {
		String data= "0123";
		String cleanData = data.trim().toLowerCase();
		boolean flag= false;
		for(int i=0;i<cleanData.length();i++) {
			if(cleanData.charAt(i)>=48 && cleanData.charAt(i)<=57) {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Give String has char or special symbol as well");
		}else {
			System.out.println("Give String has only number");
		}
	}

}
