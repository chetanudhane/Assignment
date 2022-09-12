package Day3PracticeProblems;

public class CheckEmployeePresentOrAbsent {

	public static void main(String[] args) {
		int isFullTime = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isFullTime) {
			System.out.println("Employee Is Present...");
		} else {
			System.out.println("Employee Is Absent...");
		}

	}

}
