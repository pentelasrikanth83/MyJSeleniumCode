package week1.day1;

public class J_05LearnSwitchCase {

	public static void main(String[] args) {
		
		String option="Third Class";
		switch(option) {
		
		case "Bolcony":
			System.out.println("Ticket Rate is 250");
			break;
		case "First Class":
			System.out.println("Ticket Rate is 200");
			break;
		case "Second Class":
			System.out.println("Ticket Rate is 150");
			break;
		default:
			System.out.println("Hey! Pls Enter valid Input");
		break;
		}
	
		

	}

}
