package GeneralProblems;

public class Factorial {
	
	public static int fact(int a) {
		  int ans = 1;
	        for (int i = 2; i <= a; i++) {
	            ans = ans * i;
	        }
	        return ans;
	}
	
	public static void main(String[] args) {
		int num = 5;
		 System.out.println( fact(5));
	}

}
