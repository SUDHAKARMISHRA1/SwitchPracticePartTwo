package InterviewSet;

public class Int17PrimeCheck {
	
	
	public static boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int data =8;
		
		boolean res= checkPrime(data);
		if(res==true) {
			System.out.println("Num is prime");
		}else {
			System.out.println("Num is not prime");
		}
		
	}

}
