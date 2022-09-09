package Day2;

import java.util.Scanner;

public class OperatorPrgrm2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int m = sc.nextInt();
		int d = sc.nextInt();
		boolean res = (((m == 3) && (d > 20 && d <= 31)) || ((m == 4) && (d >= 1 && d <= 30))
				|| ((m == 5) && (d >= 1 && d <= 31)) || ((m == 6) && (d >= 1 && d < 20)));
		System.out.println("Result=" + res);
	}

}
