package StringPractice;

public class ReplaceRepetativeCharwithNum {
	
	public static void main(String[] args) {
		String data = "aabbcb";
        String result = "";

        for (int i = 0; i < data.length(); i++) {

            int count = 0;

            for (int j = 0; j <= i; j++) {

                if (data.charAt(i) == data.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result = result + data.charAt(i);
            } else {
                result = result + count;
            }
        }

        System.out.println(result);
	}
}
