package Day6LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number...");
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println();
		if (sum == number) {
			System.out.println(number + " is a Perfect Number...");
		} else {
			System.out.println(number + " is not Perfect Number...");
		}

	}

}
