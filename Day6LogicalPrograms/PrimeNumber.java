package Day6LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number...");
		int number = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = false;
			}
		}
		if (prime) {
			System.out.println(number + " is a Prime Number...");
		} else {
			System.out.println(number + " is Not Prime Number...");
		}

	}

}
