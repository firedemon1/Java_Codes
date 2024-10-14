package _7_DecisionMaking;

public class _2_Switch {

	public static void main(String args[]) {
		char grade = 'D';

		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("You passed");
		case 'F':
			System.out.println("Better try again");
//			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);

		int grade1 = 3;

		switch (grade1) {
		case 1:
			System.out.println("Excellent!");
			break;
		case 2:
		case 3:
			System.out.println("Well done");
			break;
		case 4:
			System.out.println("You passed");
		case 5:
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);

		String grade2 = "C";

		switch (grade2) {
		case "A":
			System.out.println("Excellent!");
			break;
		case "B":
		case "C":
			System.out.println("Well done");
			break;
		case "D":
			System.out.println("You passed");
		case "F":
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);

	}
}