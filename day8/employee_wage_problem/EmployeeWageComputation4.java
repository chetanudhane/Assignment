package day8.employee_wage_problem;

public class EmployeeWageComputation4 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation ");
		int EMP_IS_FULL_TIME = 1;
		int EMP_WAGE_PER_HOUR = 20;
		int EMP_IS_PART_TIME = 2;
		int empWage = 0;
		int empWorkingHrs = 0;

		int empCheck = (int) ((Math.random() * 10) % 3);

		switch (empCheck) {
		case 1:
			empWorkingHrs = 8;
			break;
		case 2:
			empWorkingHrs = 4;
			break;
		default:
			empWorkingHrs = 0;
			break;
		}
		empWage = EMP_WAGE_PER_HOUR * empWorkingHrs;
		System.out.println("Daily Employee Wage : " + empWage);

	}

}
