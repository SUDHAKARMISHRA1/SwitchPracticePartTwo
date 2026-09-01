package InterviewSet;

import java.util.Arrays;
import java.util.Scanner;

public class Int4Anargams {

	 public static boolean checkAnargams(String dataA, String dataB){
	        dataA =dataA.toLowerCase();
	        dataB =dataB.toLowerCase();

	        char[] ch1 = dataA.toCharArray();
	        char[] ch2 = dataB.toCharArray();
	        Arrays.sort(ch1);
	        Arrays.sort(ch2);

	        return Arrays.equals(ch1,ch2);
	    }
	    public static void main(String[] args) {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter the String A to check:");
	            String dataA=sc.nextLine();
	            System.out.println("Enter the String B to check:");
	            String dataB=sc.nextLine();
	            int dataAlen = dataA.length();
	            int dataBlen = dataB.length();

	            if(dataAlen <= 0 || dataBlen <= 0){
	                System.out.println("Ple Enter valid String");
	            } else if (dataAlen!=dataBlen) {
	                System.out.println("Given two String are not Anargams");
	            } else {
	                boolean result = checkAnargams(dataA, dataB);
	                if (result == true) {
	                    System.out.println("Given two String are Anargams");
	                } else {
	                    System.out.println("Given two String are not Anargams");
	                }
	            }
	            sc.close();
	    }
	
}
