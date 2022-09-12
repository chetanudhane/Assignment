package Day5BasicPrograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value Of N...");
		int N = sc.nextInt();
		double hn = 1;
		for (int i = 2; i <= N; i++) {
			hn = hn + (double) 1 / i;
		}
		System.out.println(hn);

	}

}
