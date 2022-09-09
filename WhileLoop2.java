package Day2;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int rev = 0;
		while (number != 0) {
			int remainder = number % 10;
			rev = rev * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + rev);
	}

}
