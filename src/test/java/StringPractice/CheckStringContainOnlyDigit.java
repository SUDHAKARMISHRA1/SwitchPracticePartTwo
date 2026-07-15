package StringPractice;

public class CheckStringContainOnlyDigit {
	
	public static void main(String[] args) {
		String data = "123";
		boolean flag = true;
		if(data.length()<=0) {
			System.out.println("Enter valid string to check");
		}else {
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)>=48 && data.charAt(i)<=57) {
				flag=true;
			}else {
				flag = false;
				break;	
			}
		}
		
		if(flag==true) {
			System.out.println("String contain only digit");
		}else {
			System.out.println("String contain mix data");
		}
		}
	}

}
