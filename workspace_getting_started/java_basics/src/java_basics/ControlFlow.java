package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 2;
		String monthString;
		
		switch(month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		default:
			monthString = "Unknown month";
			break;
		}
		
		System.out.println(monthString);
	}

}
