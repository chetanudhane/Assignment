package Day5BasicPrograms;

import java.util.Scanner;

public class FindQuotientRemainder {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Value Of Divident...");
		int dividend = sc.nextInt();
		System.out.println("Enter Value Of Divisor...");
		int divisor = sc.nextInt();

	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);

	}

}
