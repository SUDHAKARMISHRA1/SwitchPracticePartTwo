package StringPractice;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String data= "hello";
		String uniqueData="";
		int dataLen = data.length();
		
		if(data.length()<=0) {
			System.out.println("Enter valid String");
		}else {
			for(int i=0;i<data.length();i++) {
				boolean isDuplicated = false;
				for(int j=0;j<i;j++) {
				
				if(data.charAt(i)==data.charAt(j)) {
					isDuplicated= true;
					break;
				}
				}
				if(!isDuplicated) {
					uniqueData = uniqueData + data.charAt(i);
				}
			}
		}
		
		System.out.println(uniqueData);
		
	}
	
}
