package day8.employee_wage_problem;

public class EmployeeWageComputation1 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation ");
		int IS_FULL_Time = 1;
		int empCheck = (int) ((Math.random() * 10) % 2);
		if (empCheck == IS_FULL_Time) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}

	}

}
