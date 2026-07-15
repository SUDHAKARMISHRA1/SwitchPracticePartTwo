package StringPractice;

public class RemoveAllEmptySpace {
	
	public static void main(String[] args) {
		String data = " asd asd s sd sd ";
		String cleanData = "";
		cleanData =data.replaceAll(" ", "");
		System.out.println(cleanData);
	}

}
