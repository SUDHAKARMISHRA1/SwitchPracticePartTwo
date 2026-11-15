package InterviewSet03;

public class SwitchCondition {
	
	public static String getName(int num){
		
		String day = switch(num) {
		case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> "Invalid day"; // Handles any numbers outside 1-7
				
		};
		
		return day;
		
	}
	
	public static void main(String[] args) {
		int num=2;
		String dayName = getName(num);
		System.out.println("Day on date: " +num+" is " +dayName);
		
	}

}
