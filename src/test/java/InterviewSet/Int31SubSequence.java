package InterviewSet;

public class Int31SubSequence {
	
	public static void subSeq(String data,int index,String result) {
		if(data.length()==index) {
			System.out.println("The subSeq is: " +result);
			return;
		}
		
	
		// Don't take current character
		subSeq(data,index + 1, result);

        // Take current char
		subSeq(
            data,index + 1,
            result + data.charAt(index)
        );
	}
	
	
	public static void main(String[] args) {
		String data ="abcd";
		subSeq(data, 0, "");
	}

}
